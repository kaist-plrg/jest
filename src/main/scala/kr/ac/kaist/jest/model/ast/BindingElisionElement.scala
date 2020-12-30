package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingElisionElement extends AST {
  val kind: String = "BindingElisionElement"
}
case class BindingElisionElement0(x0: Option[Elision], x1: BindingElement, parserParams: List[Boolean]) extends BindingElisionElement {
  x0.foreach((m) => m.parent = Some(this))
  x1.parent = Some(this)
  val name: String = "BindingElisionElement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    x0.map(x => inc(x.updateSpan(end)))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0.getOrElse(""), x1)
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
