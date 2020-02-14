package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ModuleSpecifier extends AST {
  val kind: String = "ModuleSpecifier"
}
case class ModuleSpecifier0(x0: Lexical, parserParams: List[Boolean]) extends ModuleSpecifier {
  val name: String = "ModuleSpecifier0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = ModuleSpecifier0
}
object ModuleSpecifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
