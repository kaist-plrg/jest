package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExportClause extends AST {
  val kind: String = "ExportClause"
}
case class ExportClause0(parserParams: List[Boolean]) extends ExportClause {
  val name: String = "ExportClause0"
  override def toString: String = {
    s"{ }"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ExportClause0
}
object ExportClause0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportClause1(x1: ExportsList, parserParams: List[Boolean]) extends ExportClause {
  x1.parent = Some(this)
  val name: String = "ExportClause1"
  override def toString: String = {
    s"{ $x1 }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ExportsList", x1, Nil).reverse
  val info: ASTInfo = ExportClause1
}
object ExportClause1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportClause2(x1: ExportsList, parserParams: List[Boolean]) extends ExportClause {
  x1.parent = Some(this)
  val name: String = "ExportClause2"
  override def toString: String = {
    s"{ $x1 , }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ExportsList", x1, Nil).reverse
  val info: ASTInfo = ExportClause2
}
object ExportClause2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
