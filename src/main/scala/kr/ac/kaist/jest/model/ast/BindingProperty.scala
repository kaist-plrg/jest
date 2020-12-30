package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingProperty extends AST {
  val kind: String = "BindingProperty"
}
case class BindingProperty0(x0: SingleNameBinding, parserParams: List[Boolean]) extends BindingProperty {
  x0.parent = Some(this)
  val name: String = "BindingProperty0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("SingleNameBinding", x0, Nil).reverse
  val info: ASTInfo = BindingProperty0
}
object BindingProperty0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropertyBindingInitialization0" -> BindingProperty0PropertyBindingInitialization0.func
  )
}
case class BindingProperty1(x0: PropertyName, x2: BindingElement, parserParams: List[Boolean]) extends BindingProperty {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "BindingProperty1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ":", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BindingElement", x2, l("PropertyName", x0, Nil)).reverse
  val info: ASTInfo = BindingProperty1
}
object BindingProperty1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> BindingProperty1BoundNames0.func,
    "ContainsExpression0" -> BindingProperty1ContainsExpression0.func,
    "PropertyBindingInitialization0" -> BindingProperty1PropertyBindingInitialization0.func
  )
}
