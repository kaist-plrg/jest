package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OptionalChain4ChainEvaluation0 extends Algorithm {
  val name: String = "OptionalChain4ChainEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalChain4ChainEvaluation0" (this, OptionalChain, Arguments, baseValue, baseReference) => {
    let optionalChain = OptionalChain
    access __x0__ = (optionalChain "ChainEvaluation")
    app __x1__ = (__x0__ baseValue baseReference)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let newReference = __x1__
    app __x2__ = (GetValue newReference)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let newValue = __x2__
    let thisChain = this
    app __x3__ = (IsInTailPosition thisChain)
    let tailCall = __x3__
    app __x4__ = (EvaluateCall newValue newReference Arguments tailCall)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
