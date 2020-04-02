package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OptionalExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = parseFunc(""""OptionalExpression1ExpressionRules0" (this, CallExpression, OptionalChain) => {
    access __x0__ = (OptionalChain "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
