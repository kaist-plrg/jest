package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingElement extends AST {
  val kind: String = "BindingElement"
}
case class BindingElement0(x0: SingleNameBinding, parserParams: List[Boolean]) extends BindingElement {
  x0.parent = Some(this)
  val name: String = "BindingElement0"
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
  val info: ASTInfo = BindingElement0
}
object BindingElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IteratorBindingInitialization0" -> BindingElement0IteratorBindingInitialization0.func
  )
}
case class BindingElement1(x0: BindingPattern, x1: Option[Initializer], parserParams: List[Boolean]) extends BindingElement {
  x0.parent = Some(this)
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "BindingElement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    x1.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1.getOrElse(""))
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Option[Initializer]", x1, l("BindingPattern", x0, Nil)).reverse
  val info: ASTInfo = BindingElement1
}
object BindingElement1 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "BoundNames1" -> BindingElement1BoundNames1.func,
    "ContainsExpression1" -> BindingElement1ContainsExpression1.func,
    "HasInitializer0" -> BindingElement1HasInitializer0.func,
    "HasInitializer1" -> BindingElement1HasInitializer1.func,
    "IsSimpleParameterList0" -> BindingElement1IsSimpleParameterList0.func,
    "IsSimpleParameterList1" -> BindingElement1IsSimpleParameterList1.func,
    "IteratorBindingInitialization1" -> BindingElement1IteratorBindingInitialization1.func,
    "KeyedBindingInitialization1" -> BindingElement1KeyedBindingInitialization1.func
  )
}
