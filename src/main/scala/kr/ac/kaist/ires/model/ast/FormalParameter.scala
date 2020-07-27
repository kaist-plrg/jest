package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FormalParameter extends AST {
  val kind: String = "FormalParameter"
}
case class FormalParameter0(x0: BindingElement, parserParams: List[Boolean]) extends FormalParameter {
  x0.parent = Some(this)
  val name: String = "FormalParameter0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BindingElement", x0, Nil).reverse
  val info: ASTInfo = FormalParameter0
}
object FormalParameter0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsSimpleParameterList0" -> FormalParameter0IsSimpleParameterList0.func,
    "IteratorBindingInitialization0" -> FormalParameter0IteratorBindingInitialization0.func
  )
}
