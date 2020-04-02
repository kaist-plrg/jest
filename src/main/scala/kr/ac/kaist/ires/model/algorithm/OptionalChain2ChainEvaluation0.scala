package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OptionalChain2ChainEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""OptionalChain2ChainEvaluation0" (this, IdentifierName, baseValue, baseReference) => {
    if true let strict = true else let strict = false
    app __x0__ = (EvaluatePropertyAccessWithIdentifierKey baseValue IdentifierName strict)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
