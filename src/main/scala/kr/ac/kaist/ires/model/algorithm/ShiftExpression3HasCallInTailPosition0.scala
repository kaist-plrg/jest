package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ShiftExpression3HasCallInTailPosition0 extends Algorithm {
  val name: String = "ShiftExpression3HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ShiftExpression3HasCallInTailPosition0" (this, ShiftExpression, AdditiveExpression, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}