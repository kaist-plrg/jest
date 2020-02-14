package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExportsList extends AST {
  val kind: String = "ExportsList"
}
case class ExportsList0(x0: ExportSpecifier, parserParams: List[Boolean]) extends ExportsList {
  val name: String = "ExportsList0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ExportSpecifier", x0, Nil).reverse
  val info: ASTInfo = ExportsList0
}
object ExportsList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportsList1(x0: ExportsList, x2: ExportSpecifier, parserParams: List[Boolean]) extends ExportsList {
  val name: String = "ExportsList1"
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ExportSpecifier", x2, l("ExportsList", x0, Nil)).reverse
  val info: ASTInfo = ExportsList1
}
object ExportsList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
