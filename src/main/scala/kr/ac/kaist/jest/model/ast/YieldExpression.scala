package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait YieldExpression extends AST {
  val kind: String = "YieldExpression"
}
case class YieldExpression0(parserParams: List[Boolean]) extends YieldExpression {
  val name: String = "YieldExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("yield")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = YieldExpression0
}
object YieldExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> YieldExpression0Evaluation0.func
  )
}
case class YieldExpression1(x2: AssignmentExpression, parserParams: List[Boolean]) extends YieldExpression {
  x2.parent = Some(this)
  val name: String = "YieldExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("yield", x2)
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, Nil).reverse
  val info: ASTInfo = YieldExpression1
}
object YieldExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> YieldExpression1Evaluation0.func
  )
}
case class YieldExpression2(x3: AssignmentExpression, parserParams: List[Boolean]) extends YieldExpression {
  x3.parent = Some(this)
  val name: String = "YieldExpression2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(end + 1)
    inc(x3.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("yield", "*", x3)
  }
  val k: Int = d(x3, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x3, Nil).reverse
  val info: ASTInfo = YieldExpression2
}
object YieldExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> YieldExpression2Evaluation0.func
  )
}
