package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OptionalChain0ChainEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""OptionalChain0ChainEvaluation0" (this, Arguments, baseValue, baseReference) => {
    let thisChain = this
    app __x0__ = (IsInTailPosition thisChain)
    let tailCall = __x0__
    app __x1__ = (EvaluateCall baseValue baseReference Arguments tailCall)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
