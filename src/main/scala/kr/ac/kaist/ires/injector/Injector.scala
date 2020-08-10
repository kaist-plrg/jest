package kr.ac.kaist.ires.injector

import kr.ac.kaist.ires.LINE_SEP
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import kr.ac.kaist.ires.model.{ Parser => JSParser, Script, ModelHelper }

case class Injector(script: Script) {
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
      case _ => ???
    }
  }

  // handle lexical variables
  private def handleLet: Unit = for (x <- createdLets) {
    getValue(st, s"$lexRecord.$x.BoundValue")._1 match {
      case c: Const => add(s"$$assert.sameValue($x, ${toJSCode(c)});")
      case (addr: Addr) => handleObject(addr, x)
      case _ => ???
    }
  }

  // handle addresses
  private var handledObjectSet = Set[Addr]()
  private def handleObject(addr: Addr, path: String): Unit = {
    println(s"handleObject: $path")
    if (handledObjectSet contains addr) return
    handledObjectSet += addr
    handlePropNames(addr, path)
    handleProperty(addr, path)
  }

  // handle property names
  private def handlePropNames(addr: Addr, path: String): Unit = {
    println("handlePropNames")
    val initSt = st.copy(globals = st.globals + (Id("input") -> addr))
    val newSt = runInst(initSt, s"app result = (GetOwnPropertyKeys input CONST_string)")
    val result = "result.SubMap"
    val len = getValue(newSt, s"$result.length.Value")._1.asInstanceOf[INum].long.toInt
    val array = (0 until len)
      .map(k => getValue(newSt, s"""$result["${k}"].Value""")._1)
      .map("\"" + _.asInstanceOf[Str].str + "\"")
      .mkString("[", ", ", "]")
    add(s"$$assert.compareArray(Object.getOwnPropertyNames($path), $array);")
  }

  // handle properties
  private val descFields = List("Value", "Writable", "Enumerable", "Configurable")
  private def handleProperty(addr: Addr, path: String): Unit = {
    println("handleProperty")
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
            case _ => println(100); ???
          }
          val desc = set.mkString("{ ", ", ", "}")
          add(s"$$verifyProperty($path, $propStr, $desc);")
        case x => println(104); println(x); ???
      }
      case _ => println(106); ???
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
        case _: Addr => getValue(st, "result.Prototype")._1 match {
          case NamedAddr(errorNameRegex(name)) => s"// ${name}Error$LINE_SEP$injected"
          case _ => println(123); ???
        }
        case x => println(125); println(x); ???
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
      case _ => println(170); ???
    }
    case _ => println(172); ???
  }

  // conversion to JS codes
  private def toJSCode(c: Const): String = c match {
    case INum(n) => n.toString
    case c => beautify(c)
  }
  private def toJSCode(value: Value): String = value match {
    case c: Const => toJSCode(c)
    case x => println(182); println(x); ???
  }
}
