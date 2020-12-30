package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OptionalChain0ChainEvaluation0 extends Algorithm {
  val name: String = "OptionalChain0ChainEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalChain0ChainEvaluation0" (this, Arguments, baseValue, baseReference) => {
    let thisChain = this
    app __x0__ = (IsInTailPosition thisChain)
    let tailCall = __x0__
    app __x1__ = (EvaluateCall baseValue baseReference Arguments tailCall)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
