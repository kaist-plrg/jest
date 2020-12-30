package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingRestElement extends AST {
  val kind: String = "BindingRestElement"
}
case class BindingRestElement0(x1: BindingIdentifier, parserParams: List[Boolean]) extends BindingRestElement {
  x1.parent = Some(this)
  val name: String = "BindingRestElement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("...", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingIdentifier", x1, Nil).reverse
  val info: ASTInfo = BindingRestElement0
}
object BindingRestElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsExpression0" -> BindingRestElement0ContainsExpression0.func,
    "IteratorBindingInitialization0" -> BindingRestElement0IteratorBindingInitialization0.func
  )
}
case class BindingRestElement1(x1: BindingPattern, parserParams: List[Boolean]) extends BindingRestElement {
  x1.parent = Some(this)
  val name: String = "BindingRestElement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("...", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingPattern", x1, Nil).reverse
  val info: ASTInfo = BindingRestElement1
}
object BindingRestElement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsExpression0" -> BindingRestElement1ContainsExpression0.func,
    "IteratorBindingInitialization0" -> BindingRestElement1IteratorBindingInitialization0.func
  )
}
