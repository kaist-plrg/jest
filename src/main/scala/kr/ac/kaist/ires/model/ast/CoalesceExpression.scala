package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CoalesceExpression extends AST {
  val kind: String = "CoalesceExpression"
}
case class CoalesceExpression0(x0: CoalesceExpressionHead, x2: BitwiseORExpression, parserParams: List[Boolean]) extends CoalesceExpression {
  val name: String = "CoalesceExpression0"
  override def toString: String = {
    s"$x0 ?? $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BitwiseORExpression", x2, l("CoalesceExpressionHead", x0, Nil)).reverse
  val info: ASTInfo = CoalesceExpression0
}
object CoalesceExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CoalesceExpression0AssignmentTargetType0.func,
    "Evaluation0" -> CoalesceExpression0Evaluation0.func,
    "ExpressionRules0" -> CoalesceExpression0ExpressionRules0.func,
    "IsFunctionDefinition0" -> CoalesceExpression0IsFunctionDefinition0.func
  )
}
