package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CoverCallExpressionAndAsyncArrowHead extends AST {
  val kind: String = "CoverCallExpressionAndAsyncArrowHead"
}
case class CoverCallExpressionAndAsyncArrowHead0(x0: MemberExpression, x1: Arguments, parserParams: List[Boolean]) extends CoverCallExpressionAndAsyncArrowHead {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "CoverCallExpressionAndAsyncArrowHead0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Arguments", x1, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = CoverCallExpressionAndAsyncArrowHead0
}
object CoverCallExpressionAndAsyncArrowHead0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> CoverCallExpressionAndAsyncArrowHead0BoundNames0.func,
    "CoveredAsyncArrowHead0" -> CoverCallExpressionAndAsyncArrowHead0CoveredAsyncArrowHead0.func,
    "CoveredCallExpression0" -> CoverCallExpressionAndAsyncArrowHead0CoveredCallExpression0.func,
    "IsSimpleParameterList0" -> CoverCallExpressionAndAsyncArrowHead0IsSimpleParameterList0.func
  )
}
