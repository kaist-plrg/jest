package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExportDeclaration extends AST {
  val kind: String = "ExportDeclaration"
}
case class ExportDeclaration0(x1: ExportFromClause, x2: FromClause, parserParams: List[Boolean]) extends ExportDeclaration {
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ExportDeclaration0"
  override def toString: String = {
    s"export $x1 $x2 ;"
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("FromClause", x2, l("ExportFromClause", x1, Nil)).reverse
  val info: ASTInfo = ExportDeclaration0
}
object ExportDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportDeclaration1(x1: NamedExports, parserParams: List[Boolean]) extends ExportDeclaration {
  x1.parent = Some(this)
  val name: String = "ExportDeclaration1"
  override def toString: String = {
    s"export $x1 ;"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("NamedExports", x1, Nil).reverse
  val info: ASTInfo = ExportDeclaration1
}
object ExportDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportDeclaration2(x1: VariableStatement, parserParams: List[Boolean]) extends ExportDeclaration {
  x1.parent = Some(this)
  val name: String = "ExportDeclaration2"
  override def toString: String = {
    s"export $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("VariableStatement", x1, Nil).reverse
  val info: ASTInfo = ExportDeclaration2
}
object ExportDeclaration2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportDeclaration3(x1: Declaration, parserParams: List[Boolean]) extends ExportDeclaration {
  x1.parent = Some(this)
  val name: String = "ExportDeclaration3"
  override def toString: String = {
    s"export $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Declaration", x1, Nil).reverse
  val info: ASTInfo = ExportDeclaration3
}
object ExportDeclaration3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportDeclaration4(x2: HoistableDeclaration, parserParams: List[Boolean]) extends ExportDeclaration {
  x2.parent = Some(this)
  val name: String = "ExportDeclaration4"
  override def toString: String = {
    s"export default $x2"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("HoistableDeclaration", x2, Nil).reverse
  val info: ASTInfo = ExportDeclaration4
}
object ExportDeclaration4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportDeclaration5(x2: ClassDeclaration, parserParams: List[Boolean]) extends ExportDeclaration {
  x2.parent = Some(this)
  val name: String = "ExportDeclaration5"
  override def toString: String = {
    s"export default $x2"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("ClassDeclaration", x2, Nil).reverse
  val info: ASTInfo = ExportDeclaration5
}
object ExportDeclaration5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportDeclaration6(x3: AssignmentExpression, parserParams: List[Boolean]) extends ExportDeclaration {
  x3.parent = Some(this)
  val name: String = "ExportDeclaration6"
  override def toString: String = {
    s"export default $x3 ;"
  }
  val k: Int = d(x3, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x3, Nil).reverse
  val info: ASTInfo = ExportDeclaration6
}
object ExportDeclaration6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
