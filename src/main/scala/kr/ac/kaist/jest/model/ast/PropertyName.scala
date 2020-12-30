package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait PropertyName extends AST {
  val kind: String = "PropertyName"
}
case class PropertyName0(x0: LiteralPropertyName, parserParams: List[Boolean]) extends PropertyName {
  x0.parent = Some(this)
  val name: String = "PropertyName0"
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
  val fullList: List[(String, Value)] = l("LiteralPropertyName", x0, Nil).reverse
  val info: ASTInfo = PropertyName0
}
object PropertyName0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> PropertyName0ComputedPropertyContains0.func,
    "IsComputedPropertyKey0" -> PropertyName0IsComputedPropertyKey0.func
  )
}
case class PropertyName1(x0: ComputedPropertyName, parserParams: List[Boolean]) extends PropertyName {
  x0.parent = Some(this)
  val name: String = "PropertyName1"
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
  val fullList: List[(String, Value)] = l("ComputedPropertyName", x0, Nil).reverse
  val info: ASTInfo = PropertyName1
}
object PropertyName1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> PropertyName1ComputedPropertyContains0.func,
    "IsComputedPropertyKey0" -> PropertyName1IsComputedPropertyKey0.func
  )
}
