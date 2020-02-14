package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportSpecifier extends AST {
  val kind: String = "ImportSpecifier"
}
case class ImportSpecifier0(x0: ImportedBinding, parserParams: List[Boolean]) extends ImportSpecifier {
  val name: String = "ImportSpecifier0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ImportedBinding", x0, Nil).reverse
  val info: ASTInfo = ImportSpecifier0
}
object ImportSpecifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportSpecifier1(x0: Lexical, x2: ImportedBinding, parserParams: List[Boolean]) extends ImportSpecifier {
  val name: String = "ImportSpecifier1"
  override def toString: String = {
    s"$x0 as $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ImportedBinding", x2, l("Lexical", x0, Nil)).reverse
  val info: ASTInfo = ImportSpecifier1
}
object ImportSpecifier1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
