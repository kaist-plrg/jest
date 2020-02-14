package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingRestProperty extends AST {
  val kind: String = "BindingRestProperty"
}
case class BindingRestProperty0(x1: BindingIdentifier, parserParams: List[Boolean]) extends BindingRestProperty {
  val name: String = "BindingRestProperty0"
  override def toString: String = {
    s"... $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingIdentifier", x1, Nil).reverse
  val info: ASTInfo = BindingRestProperty0
}
object BindingRestProperty0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "RestBindingInitialization0" -> BindingRestProperty0RestBindingInitialization0.func
  )
}
