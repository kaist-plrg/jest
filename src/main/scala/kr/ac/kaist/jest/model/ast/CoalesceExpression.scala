package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CoalesceExpression extends AST {
  val kind: String = "CoalesceExpression"
}
case class CoalesceExpression0(x0: CoalesceExpressionHead, x2: BitwiseORExpression, parserParams: List[Boolean]) extends CoalesceExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "CoalesceExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "??", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BitwiseORExpression", x2, l("CoalesceExpressionHead", x0, Nil)).reverse
  val info: ASTInfo = CoalesceExpression0
}
object CoalesceExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> CoalesceExpression0Evaluation0.func,
    "HasCallInTailPosition0" -> CoalesceExpression0HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> CoalesceExpression0IsFunctionDefinition0.func
  )
}
