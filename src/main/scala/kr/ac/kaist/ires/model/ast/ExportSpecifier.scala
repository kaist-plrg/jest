package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExportSpecifier extends AST {
  val kind: String = "ExportSpecifier"
}
case class ExportSpecifier0(x0: Lexical, parserParams: List[Boolean]) extends ExportSpecifier {
  x0.parent = Some(this)
  val name: String = "ExportSpecifier0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = ExportSpecifier0
}
object ExportSpecifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportSpecifier1(x0: Lexical, x2: Lexical, parserParams: List[Boolean]) extends ExportSpecifier {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ExportSpecifier1"
  override def toString: String = {
    s"$x0 as $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Lexical1", x2, l("Lexical0", x0, Nil)).reverse
  val info: ASTInfo = ExportSpecifier1
}
object ExportSpecifier1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
