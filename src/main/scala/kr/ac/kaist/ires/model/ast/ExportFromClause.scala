package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExportFromClause extends AST {
  val kind: String = "ExportFromClause"
}
case class ExportFromClause0(parserParams: List[Boolean]) extends ExportFromClause {
  val name: String = "ExportFromClause0"
  override def toString: String = {
    s"*"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ExportFromClause0
}
object ExportFromClause0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportFromClause1(x2: Lexical, parserParams: List[Boolean]) extends ExportFromClause {
  val name: String = "ExportFromClause1"
  override def toString: String = {
    s"* as $x2"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Lexical", x2, Nil).reverse
  val info: ASTInfo = ExportFromClause1
}
object ExportFromClause1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportFromClause2(x0: NamedExports, parserParams: List[Boolean]) extends ExportFromClause {
  val name: String = "ExportFromClause2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("NamedExports", x0, Nil).reverse
  val info: ASTInfo = ExportFromClause2
}
object ExportFromClause2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
