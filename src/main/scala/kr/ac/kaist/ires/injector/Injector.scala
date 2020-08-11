package kr.ac.kaist.ires.injector

import kr.ac.kaist.ires.LINE_SEP
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import kr.ac.kaist.ires.model.{ Parser => JSParser, Script, ModelHelper }

case class Injector(script: Script, debug: Boolean = false) {
  // injected script
  lazy val result = {
    if (isNormal) {
      println("handling varaible...")
      handleVariable

      println("handling let...")
      handleLet
    }
    println("handling Exception...")
    handleException
    injected
  }

  // logging
  def log(any: Any): Unit = if (debug) println(any)
  def warning: Unit = if (debug) {
    val trace = (new Throwable).getStackTrace
    val line = trace(1).getLineNumber
    println(s"[Warning] $script @ $line")
  }

  // initial state
  private val initState = ModelHelper.initState(script)

  // interpreter
  private val interp = new Interp(false, None)

  // final state
  private val st = interp(initState)

  // injected script
  private var injected = script.toString

  //////////////////////////////////////////////////////////
  // Helper Functions
  //////////////////////////////////////////////////////////
  // add assertions
  private var assertCount = 0
  def add(assert: String): Unit = { assertCount += 1; injected += assert }

  // handle variables
  private def handleVariable: Unit = for (x <- createdVars) {
    getValue(st, s"$globalMap.$x.Value")._1 match {
      case c: Const => add(s"$$assert.sameValue($x, ${toJSCode(c)});")
      case (addr: Addr) => handleObject(addr, x)
      case _ =>
    }
  }

  // handle lexical variables
  private def handleLet: Unit = for (x <- createdLets) {
    getValue(st, s"$lexRecord.$x.BoundValue")._1 match {
      case c: Const => add(s"$$assert.sameValue($x, ${toJSCode(c)});")
      case (addr: Addr) => handleObject(addr, x)
      case _ =>
    }
  }

  // handle addresses
  private val PREFIX_GLOBAL = "GLOBAL."
  private val PREFIX_INTRINSIC = "INTRINSIC_"
  private def addrToName(addr: Addr): Option[String] = addr match {
    case a @ NamedAddr(name) if name.startsWith(PREFIX_GLOBAL) =>
      val str = name.substring(PREFIX_GLOBAL.length)
      if (str.startsWith(PREFIX_INTRINSIC)) None
      else Some(str)
    case _ => None
  }
  private var handledObjects: Map[Addr, String] = (for {
    (addr, _) <- initState.heap.map
    name <- addrToName(addr)
  } yield addr -> name).toMap
  private def handleObject(addr: Addr, path: String): Unit = {
    log(s"handleObject: $path")
    handledObjects.get(addr) match {
      case Some(origPath) =>
        add(s"$$assert.sameValue($path, $origPath);")
      case None =>
        handledObjects += addr -> path
        handlePrototype(addr, path)
        handleExtensible(addr, path)
        handleCall(addr, path)
        handleConstruct(addr, path)
        handlePropKeys(addr, path)
        handleProperty(addr, path)
    }
  }

  // handle [[Prototype]]
  private def handlePrototype(addr: Addr, path: String): Unit = {
    log(s"handlePrototype: $path")
    access(st, addr, Str("Prototype")) match {
      case (proto: Addr) => handleObject(proto, s"Object.getPrototypeOf($path)")
      case _ => warning
    }
  }

  // handle [[Extensible]]
  private def handleExtensible(addr: Addr, path: String): Unit = {
    log(s"handleExtensible: $path")
    access(st, addr, Str("Extensible")) match {
      case Bool(b) => add(s"$$assert.sameValue(Object.isExtensible($path), $b);")
      case _ => warning
    }
  }

  // handle [[Call]]
  private def handleCall(addr: Addr, path: String): Unit = {
    log(s"handleCall: $path")
    if (access(st, addr, Str("Call")) == Absent) {
      add(s"$$assert.notCallable($path);")
    } else add(s"$$assert.callable($path);")
  }

  // handle [[Construct]]
  private def handleConstruct(addr: Addr, path: String): Unit = {
    log(s"handleConstruct: $path")
    if (access(st, addr, Str("Construct")) == Absent) {
      add(s"$$assert.notConstructable($path);")
    } else add(s"$$assert.constructable($path);")
  }

  // handle property names
  private def handlePropKeys(addr: Addr, path: String): Unit = {
    log("handlePropKeys")
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
      add(s"$$assert.compareArray(Reflect.ownKeys($path), ${array.mkString("[", ", ", "]")});")
  }

  // handle properties
  private val descFields = List("Value", "Writable", "Enumerable", "Configurable")
  private def handleProperty(addr: Addr, path: String): Unit = {
    log("handleProperty")
    val subMap = access(st, addr, Str("SubMap"))
    for (p <- getKeys(subMap)) access(st, subMap, p) match {
      case addr: Addr => st(addr) match {
        case IRMap(Ty("DataProperty"), props, _) =>
          var set = Set[String]()
          val propStr = toJSCode(p)
          for {
            field <- descFields
            (value, _) <- props.get(Str(field))
          } interp.escapeCompletion((value, st)) match {
            case (c: Const, _) => set += s"${field.toLowerCase}: ${toJSCode(c)}"
            case (addr: Addr, _) if field == "Value" =>
              handleObject(addr, s"$path[$propStr]")
            case _ => warning
          }
          val desc = set.mkString("{ ", ", ", "}")
          add(s"$$verifyProperty($path, $propStr, $desc);")
        case x => warning
      }
      case _ => warning
    }
  }

  // handle exceptions
  private val errorNameRegex = "GLOBAL.([A-Z][a-z]+)Error.prototype".r
  private def isNormal: Boolean =
    getValue(st, "result.Type")._1 == NamedAddr("CONST_normal")
  private def handleException: Unit = getValue(st, "result.Type")._1 match {
    case NamedAddr("CONST_normal") =>
      injected = s"// Normal$LINE_SEP$injected"
    case _ =>
      injected = getValue(st, "result.Value")._1 match {
        case c: Const => s"// Throw ${toJSCode(c)}$LINE_SEP$injected"
        case addr: Addr => getValue(st, "result.Prototype")._1 match {
          case NamedAddr(errorNameRegex(name)) => s"// ${name}Error:$LINE_SEP$injected"
          case _ => warning; s"// Throw ${beautify(addr)}$LINE_SEP$injected"
        }
        case x => warning; s"// Throw ${beautify(x)}$LINE_SEP$injected"
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
  private val globalMap = "REALM.GlobalObject.SubMap"
  private lazy val createdVars: Set[String] = {
    val initial = getStrKeys(getValue(st, "GLOBAL")._1)
    val current = getStrKeys(getValue(st, globalMap)._1)
    current -- initial
  }

  // get created lexical variables
  private val lexRecord = "REALM.GlobalEnv.EnvironmentRecord.DeclarativeRecord.SubMap"
  private lazy val createdLets: Set[String] =
    getStrKeys(getValue(st, lexRecord)._1)

  // get keys
  private def getStrKeys(value: Value): Set[String] =
    getKeys(value).collect { case Str(p) => p }
  private def getKeys(value: Value): Set[Value] = value match {
    case addr: Addr => st(addr) match {
      case (m: IRMap) => m.props.keySet
      case _ => warning; ???
    }
    case _ => warning; ???
  }

  // conversion to JS codes
  private def toJSCode(c: Const): String = c match {
    case INum(n) => n.toString
    case c => beautify(c)
  }
  private def toJSCode(value: Value): String = value match {
    case c: Const => toJSCode(c)
    case addr: Addr => addrToName(addr) match {
      case Some(name) => name
      case None => warning; ???
    }
    case x => warning; log(s"$x @ toJSCode"); ???
  }
}
