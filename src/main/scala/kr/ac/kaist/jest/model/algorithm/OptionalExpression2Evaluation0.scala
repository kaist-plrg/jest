package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OptionalExpression2Evaluation0 extends Algorithm {
  val name: String = "OptionalExpression2Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalExpression2Evaluation0" (this, OptionalExpression, OptionalChain) => {
    access __x0__ = (OptionalExpression "Evaluation")
    let baseReference = __x0__
    app __x1__ = (GetValue baseReference)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let baseValue = __x1__
    if (|| (= baseValue undefined) (= baseValue null)) {
      app __x2__ = (WrapCompletion undefined)
      return __x2__
    } else {}
    access __x3__ = (OptionalChain "ChainEvaluation")
    app __x4__ = (__x3__ baseValue baseReference)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
