package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CoalesceExpression0AssignmentTargetType0 extends Algorithm {
  val name: String = "CoalesceExpression0AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoalesceExpression0AssignmentTargetType0" (this, CoalesceExpressionHead, BitwiseORExpression) => return CONST_invalid"""), this)
}
