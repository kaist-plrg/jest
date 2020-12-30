package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LeftHandSideExpression extends AST {
  val kind: String = "LeftHandSideExpression"
}
case class LeftHandSideExpression0(x0: NewExpression, parserParams: List[Boolean]) extends LeftHandSideExpression {
  x0.parent = Some(this)
  val name: String = "LeftHandSideExpression0"
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
  val fullList: List[(String, Value)] = l("NewExpression", x0, Nil).reverse
  val info: ASTInfo = LeftHandSideExpression0
}
object LeftHandSideExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class LeftHandSideExpression1(x0: CallExpression, parserParams: List[Boolean]) extends LeftHandSideExpression {
  x0.parent = Some(this)
  val name: String = "LeftHandSideExpression1"
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
  val fullList: List[(String, Value)] = l("CallExpression", x0, Nil).reverse
  val info: ASTInfo = LeftHandSideExpression1
}
object LeftHandSideExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsDestructuring0" -> LeftHandSideExpression1IsDestructuring0.func,
    "IsFunctionDefinition0" -> LeftHandSideExpression1IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> LeftHandSideExpression1IsIdentifierRef0.func
  )
}
case class LeftHandSideExpression2(x0: OptionalExpression, parserParams: List[Boolean]) extends LeftHandSideExpression {
  x0.parent = Some(this)
  val name: String = "LeftHandSideExpression2"
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
  val fullList: List[(String, Value)] = l("OptionalExpression", x0, Nil).reverse
  val info: ASTInfo = LeftHandSideExpression2
}
object LeftHandSideExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsDestructuring0" -> LeftHandSideExpression2IsDestructuring0.func,
    "IsFunctionDefinition0" -> LeftHandSideExpression2IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> LeftHandSideExpression2IsIdentifierRef0.func
  )
}
