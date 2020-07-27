package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingElisionElement extends AST {
  val kind: String = "BindingElisionElement"
}
case class BindingElisionElement0(x0: Option[Elision], x1: BindingElement, parserParams: List[Boolean]) extends BindingElisionElement {
  x0.foreach((m) => m.parent = Some(this))
  x1.parent = Some(this)
  val name: String = "BindingElisionElement0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.fold(k)(_.updateSpan(k)) + 1
    k = x1.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"${x0.getOrElse("")} $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("BindingElement", x1, l("Option[Elision]", x0, Nil)).reverse
  val info: ASTInfo = BindingElisionElement0
}
object BindingElisionElement0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "BoundNames1" -> BindingElisionElement0BoundNames1.func,
    "ContainsExpression1" -> BindingElisionElement0ContainsExpression1.func,
    "IteratorBindingInitialization0" -> BindingElisionElement0IteratorBindingInitialization0.func,
    "IteratorBindingInitialization1" -> BindingElisionElement0IteratorBindingInitialization1.func
  )
}
