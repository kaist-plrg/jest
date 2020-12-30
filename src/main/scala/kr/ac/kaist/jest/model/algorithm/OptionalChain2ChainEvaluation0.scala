package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OptionalChain2ChainEvaluation0 extends Algorithm {
  val name: String = "OptionalChain2ChainEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalChain2ChainEvaluation0" (this, IdentifierName, baseValue, baseReference) => {
    let strict = true
    app __x0__ = (EvaluatePropertyAccessWithIdentifierKey baseValue IdentifierName strict)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
