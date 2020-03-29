package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalANDExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = parseFunc(""""LogicalANDExpression1ExpressionRules0" (this, LogicalANDExpression, BitwiseORExpression) => {
    access __x0__ = (BitwiseORExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
