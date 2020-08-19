package kr.ac.kaist.ires.injector

import kr.ac.kaist.ires.LINE_SEP
import kr.ac.kaist.ires.error.IRError
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import kr.ac.kaist.ires.model.{ Parser => JSParser, Script, ModelHelper }

case class Injector(script: Script, debug: Boolean = false) {
  // injected script
  lazy val result = {
    uidOpt match {
      case Some(uid) =>
        println("handling IRError...")
        handleIRError(uid)
      case None =>
        println("handling Exception...")
        handleException

        if (isNormal) {
          println("handling varaible...")
          handleVariable

          println("handling let...")
          handleLet

          if (isAsync) {
            println("handling async...")
            handleAsync
          }
        }
    }
    s"$header$LINE_SEP$script$LINE_SEP$assertions"
  }

  // visited
  lazy val visited = interp.visited

  // logging
  def log(any: Any): Unit = if (debug) println(any)
  def warning: Unit = if (debug) {
    val trace = (new Throwable).getStackTrace
    val line = trace(1).getLineNumber
    println(s"[Warning] $script @ $line")
  }

  // initial state
  private lazy val initState = ModelHelper.initState(script)

  // update span
  script.updateSpan(0)

  // interpreter
  private lazy val interp = new Interp(getName = true)

  // final state
  private lazy val (st, uidOpt) = try {
    val st = interp(initState)
    interp.getName = false
    (st, None)
  } catch {
    case e: IRError => (initState, Some(interp.recentInst.get.uid))
  }

  // injected script
  private var header = ""
  private var assertions = ""

  //////////////////////////////////////////////////////////
  // Helper Functions
  //////////////////////////////////////////////////////////
  // add assertions
  private var assertCount = 0
  def add(assert: String): Unit = { assertCount += 1; assertions += assert; assertions += LINE_SEP; }

  // handle variables
  private def handleVariable: Unit = for (x <- createdVars) {
    getValue(st, s"$globalMap.$x.Value")._1 match {
      case c: Const => add(s"$$assert.sameValue($x, ${const2code(c)});")
      case (addr: Addr) => handleObject(addr, x)
      case _ =>
    }
  }

  // handle lexical variables
  private def handleLet: Unit = for (x <- createdLets) {
    getValue(st, s"$lexRecord.$x.BoundValue")._1 match {
      case c: Const => add(s"$$assert.sameValue($x, ${const2code(c)});")
      case (addr: Addr) => handleObject(addr, x)
      case _ =>
    }
  }

  // handle addresses
  private lazy val PREFIX_GLOBAL = "GLOBAL."
  private lazy val PREFIX_INTRINSIC = "INTRINSIC_"
  private def addrToName(addr: Addr): Option[String] = addr match {
    case a @ NamedAddr(name) if name.startsWith(PREFIX_GLOBAL) =>
      val str = name.substring(PREFIX_GLOBAL.length).replaceAll(s"#$PREFIX_GLOBAL", "")
      if (str.startsWith(PREFIX_INTRINSIC)) None
      else Some(str)
    case _ => None
  }
  private var handledObjects: Map[Addr, String] = (for {
    (addr, _) <- initState.heap.map
    name <- addrToName(addr)
  } yield addr -> name).toMap
  private def handleObject(addr: Addr, path: String): Unit = {
    log(s"handleObject: $addr, $path")
    (addr, handledObjects.get(addr)) match {
      case (_, Some(origPath)) =>
        add(s"$$assert.sameValue($path, $origPath);")
      case (_: DynamicAddr, None) if addr != globalThis =>
        handledObjects += addr -> path
        interp.addrName.get(addr).map(name => add(s"""$$algo.set($path, "$name")"""))
        handlePrototype(addr, path)
        handleExtensible(addr, path)
        handleCall(addr, path)
        handleConstruct(addr, path)
        handlePropKeys(addr, path)
        handleProperty(addr, path)
      case _ =>
    }
  }

  // handle [[Prototype]]
  private def handlePrototype(addr: Addr, path: String): Unit = {
    log(s"handlePrototype: $addr, $path")
    access(st, addr, Str("Prototype")) match {
      case (proto: Addr) => handleObject(proto, s"Object.getPrototypeOf($path)")
      case _ => warning
    }
  }

  // handle [[Extensible]]
  private def handleExtensible(addr: Addr, path: String): Unit = {
    log(s"handleExtensible: $addr, $path")
    access(st, addr, Str("Extensible")) match {
      case Bool(b) => add(s"$$assert.sameValue(Object.isExtensible($path), $b);")
      case _ => warning
    }
  }

  // handle [[Call]]
  private def handleCall(addr: Addr, path: String): Unit = {
    log(s"handleCall: $addr, $path")
    if (access(st, addr, Str("Call")) == Absent) {
      add(s"$$assert.notCallable($path);")
    } else add(s"$$assert.callable($path);")
  }

  // handle [[Construct]]
  private def handleConstruct(addr: Addr, path: String): Unit = {
    log(s"handleConstruct: $addr, $path")
    if (access(st, addr, Str("Construct")) == Absent) {
      add(s"$$assert.notConstructable($path);")
    } else add(s"$$assert.constructable($path);")
  }

  // handle property names
  private def handlePropKeys(addr: Addr, path: String): Unit = {
    log(s"handlePropKeys: $addr, $path")
    val initSt = st.copy(globals = st.globals + (Id("input") -> addr))
    val newSt = runInst(initSt, s"app result = (input.OwnPropertyKeys input)")
    val result = "result.Value"
    val len = getValue(newSt, s"$result.length")._1.asInstanceOf[INum].long.toInt
    val array = (0 until len)
      .map(k => getValue(newSt, s"""$result[${k}i]""")._1)
      .flatMap(_ match {
        case Str(str) => Some(s"'$str'")
        case addr: Addr => addrToName(addr)
        case _ => None
      })
    if (array.length == len)
      add(s"$$assert.compareArray(Reflect.ownKeys($path), ${array.mkString("[", ", ", "]")}, $path);")
  }

  // handle properties
  private lazy val fields = List("Get", "Set", "Value", "Writable", "Enumerable", "Configurable")
  private def handleProperty(addr: Addr, path: String): Unit = {
    log(s"handleProperty: $addr, $path")
    val subMap = access(st, addr, Str("SubMap"))
    for (p <- getKeys(subMap)) access(st, subMap, p) match {
      case addr: Addr => st(addr) match {
        case IRMap(Ty("DataProperty" | "AccessorProperty"), props, _) =>
          var set = Set[String]()
          val2code(p).map(propStr => {
            for {
              field <- fields
              (value, _) <- props.get(Str(field))
            } interp.escapeCompletion((value, st)) match {
              case (c: Const, _) => set += s"${field.toLowerCase}: ${const2code(c)}"
              case (addr: Addr, _) => field match {
                case "Value" => handleObject(addr, s"$path[$propStr]")
                case "Get" => handleObject(addr, s"Object.getOwnPropertyDescriptor($path, $propStr).get")
                case "Set" => handleObject(addr, s"Object.getOwnPropertyDescriptor($path, $propStr).set")
                case _ =>
              }
              case _ => warning
            }
            val desc = set.mkString("{ ", ", ", "}")
            add(s"$$verifyProperty($path, $propStr, $desc);")
          })
        case x => warning
      }
      case _ => warning
    }
  }

  // handle async
  lazy val isAsync: Boolean = {
    val str = script.toString
    str.contains("async") || str.contains("Promise")
  }
  private def handleAsync: Unit = {
    assertions = s"$$delay( ( ) => {$LINE_SEP$assertions})"
  }

  // handle ir-error
  private def handleIRError(uid: Int): Unit = header = s"// IRError: $uid"

  // handle exceptions
  private lazy val errorNameRegex = "GLOBAL.([A-Z][a-z]+)Error.prototype".r
  private def isNormal: Boolean =
    getValue(st, "result.Type")._1 == NamedAddr("CONST_normal")
  private def handleException: Unit = getValue(st, "result.Type")._1 match {
    case NamedAddr("CONST_normal") =>
      header = s"// Normal:"
    case _ =>
      header = getValue(st, "result.Value")._1 match {
        case addr: Addr => getValue(st, "result.Prototype")._1 match {
          case NamedAddr(errorNameRegex(name)) => s"// ${name}Error:"
          case _ => warning; s"// Throw ${beautify(addr)}:"
        }
        case x => warning; s"// Throw ${beautify(x)}:"
      }
  }

  // get values
  private def getValue(st: State, str: String): (Value, State) =
    interp.escapeCompletion(getValue(st, parseExpr(str)))
  private def getValue(st: State, expr: Expr): (Value, State) =
    interp.interp(expr)(st)
  private def getValue(st: State, refV: RefValue): (Value, State) =
    interp.interp(refV)(st)
  private def getValue(st: State, addr: Addr, prop: String): (Value, State) =
    getValue(st, RefValueProp(addr, Str(prop)))

  // run instructions
  private def runInst(st: State, str: String): State = {
    val inst = parseInst(str)
    interp(st.copy(context = st.context.copy(insts = List(inst))))
  }

  // access properties
  private def access(st: State, base: Value, props: Value*): Value =
    props.foldLeft(base) {
      case (base, p) => getValue(st, interp.interp(base, p)(st)._1)._1
    }

  // get created variables
  private lazy val globalMap = "REALM.GlobalObject.SubMap"
  private lazy val globalThis = getValue(st, s"$globalMap.globalThis.Value")._1
  private lazy val createdVars: Set[String] = {
    val initial = getStrKeys(getValue(st, "GLOBAL")._1)
    val current = getStrKeys(getValue(st, globalMap)._1)
    current -- initial
  }

  // get created lexical variables
  private lazy val lexRecord = "REALM.GlobalEnv.EnvironmentRecord.DeclarativeRecord.SubMap"
  private lazy val createdLets: Set[String] =
    getStrKeys(getValue(st, lexRecord)._1)

  // get keys
  private def getStrKeys(value: Value): Set[String] =
    getKeys(value).collect { case Str(p) => p }
  private def getKeys(value: Value): Set[Value] = value match {
    case addr: Addr => st(addr) match {
      case (m: IRMap) => m.props.keySet
      case _ => warning; Set()
    }
    case _ => warning; Set()
  }

  // conversion to JS codes
  private def const2code(c: Const): String = c match {
    case INum(n) => n.toString
    case c => beautify(c)
  }
  private def val2code(value: Value): Option[String] = value match {
    case c: Const => Some(const2code(c))
    case addr: Addr => addrToName(addr) match {
      case Some(name) => Some(name)
      case None => warning; None
    }
    case x => warning; log(s"$x @ val2code"); None
  }
}
