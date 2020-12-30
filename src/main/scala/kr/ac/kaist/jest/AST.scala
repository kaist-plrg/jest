package kr.ac.kaist.jest

import kr.ac.kaist.jest.ir._

trait AST {
  var strict: Boolean = false
  var parent: Option[AST] = None
  val kind: String
  val name: String
  val k: Int
  val parserParams: List[Boolean]
  val info: ASTInfo
  val fullList: List[(String, Value)]

  // span information
  def updateSpan(start: Int): Int
  def inc(newEnd: Int): Unit = if (newEnd > end) end = newEnd + 1
  var start: Int = -1
  var end: Int = -1

  def s(seq: Any*): String = seq.map(_.toString).filter(_ != "").mkString(" ")

  // to JSON format
  def toJson: String = "{" + (fullList.map {
    case (name, value) => "\"" + name + "\":" + (value match {
      case ASTVal(ast) => ast.toJson
      case Str(str) => "\"" + str + "\""
      case _ => null
    })
  }).mkString(",") + "}"

  // get possible kinds
  def getKinds: Set[String] = (list match {
    case List((_, ASTVal(ast))) => ast.getKinds
    case _ => Set()
  }) ++ Set(kind)

  // get element list for the given kind
  def getElems(given: String): List[AST] = {
    if (given == kind) List(this)
    else list.foldLeft(List[AST]()) {
      case (l, (_, ASTVal(ast))) => l ++ ast.getElems(given)
      case (l, _) => l
    }
  }

  // list of actual values
  lazy val list: List[(String, Value)] = fullList.filter {
    case (_, Absent) => false
    case _ => true
  }

  // get semantics
  def semantics(fname: String): Option[(Func, List[Value])] = {
    ((k to info.maxK).foldLeft[Option[(Func, List[Value])]](None) {
      case (None, i) if i == k => info.semMap.get(fname + i.toString).map((_, list.map(_._2)))
      case (None, i) if (i & k) == k => info.semMap.get(fname + i.toString).map((_, fullList.map(_._2)))
      case (res, _) => res
    }) match {
      case Some((f, list)) => Some((f, ASTVal(this) :: list))
      // `Contains` static semantics
      case None => if (fname == "Contains") Some((Func(
        name + fname,
        Id("this") :: (list.map { case (x, _) => Id(x) } :+ Id("symbol")),
        None,
        list.foldLeft[Inst](IReturn(EBool(false))) {
          case (base, (kind, value)) => IIf(
            EBOp(OEq, ERef(RefId(Id("symbol"))), EStr(kind)),
            IReturn(EBool(true)),
            ISeq(List(
              IAccess(Id("res"), ERef(RefId(Id(kind))), EStr("Contains")),
              IApp(Id("res"), ERef(RefId(Id("res"))), List(ERef(RefId(Id("symbol"))))),
              IIf(
                ERef(RefId(Id("res"))),
                IReturn(EBool(true)),
                base
              )
            ))
          )
        }
      ), ASTVal(this) :: list.map(_._2)))
      else (list match {
        // case None => (list match {
        case List((_, ASTVal(x))) => x.semantics(fname)
        case _ => None
      })
    }
  }

  // get sub-AST
  def subs(name: String): Option[Value] = list.toMap.get(name)

  // Helpers
  protected def d(x: Any, n: Int): Int = x match {
    case Some(_) => 2 * n + 1
    case None => 2 * n
    case _ => n
  }
  protected def l(name: String, x: Any, list: List[(String, Value)]): List[(String, Value)] = x match {
    case Some(a: AST) => (name.substring(7, name.length - 1), ASTVal(a)) :: list
    case None => (name.substring(7, name.length - 1), Absent) :: list
    case a: AST => (name, ASTVal(a)) :: list
    case _ => list
  }
}

trait ASTInfo {
  val maxK: Int
  val semMap: Map[String, Func]
}

case class Lexical(kind: String, str: String) extends AST {
  val name: String = kind
  val k: Int = 0
  val parserParams: List[Boolean] = Nil
  val info: ASTInfo = LexicalInfo
  val fullList: List[(String, Value)] = Nil
  def updateSpan(start: Int): Int = {
    this.start = start
    this.end = start + str.length
    this.end
  }
  override def toString: String = str
}
object LexicalInfo extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
