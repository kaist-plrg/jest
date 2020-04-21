package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalORExpression1HasCallInTailPosition0 {
  val length: Int = 0
  val func: Func = parseFunc(""""LogicalORExpression1HasCallInTailPosition0" (this, LogicalORExpression, LogicalANDExpression, call) => {
    access __x0__ = (LogicalANDExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
