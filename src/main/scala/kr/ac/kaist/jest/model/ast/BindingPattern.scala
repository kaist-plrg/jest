package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingPattern extends AST {
  val kind: String = "BindingPattern"
}
case class BindingPattern0(x0: ObjectBindingPattern, parserParams: List[Boolean]) extends BindingPattern {
  x0.parent = Some(this)
  val name: String = "BindingPattern0"
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
  val fullList: List[(String, Value)] = l("ObjectBindingPattern", x0, Nil).reverse
  val info: ASTInfo = BindingPattern0
}
object BindingPattern0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> BindingPattern0BindingInitialization0.func
  )
}
case class BindingPattern1(x0: ArrayBindingPattern, parserParams: List[Boolean]) extends BindingPattern {
  x0.parent = Some(this)
  val name: String = "BindingPattern1"
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
  val fullList: List[(String, Value)] = l("ArrayBindingPattern", x0, Nil).reverse
  val info: ASTInfo = BindingPattern1
}
object BindingPattern1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> BindingPattern1BindingInitialization0.func
  )
}
