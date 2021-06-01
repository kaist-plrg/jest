package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgumentList2ArgumentListEvaluation0 extends Algorithm {
  val name: String = "ArgumentList2ArgumentListEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgumentList2ArgumentListEvaluation0" (this, ArgumentList, AssignmentExpression) => {
    access __x0__ = (ArgumentList "ArgumentListEvaluation")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let precedingArgs = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let ref = __x1__
    app __x2__ = (GetValue ref)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let arg = __x2__
    append arg -> precedingArgs
    app __x3__ = (WrapCompletion precedingArgs)
    return __x3__
  }"""), this)
}
