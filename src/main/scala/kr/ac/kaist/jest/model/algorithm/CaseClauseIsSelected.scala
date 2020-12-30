package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CaseClauseIsSelected extends Algorithm {
  val name: String = "CaseClauseIsSelected"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseClauseIsSelected" (C, input) => {
    access __x0__ = (C "Expression")
    access __x1__ = (__x0__ "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let clauseSelector = __x2__
    app __x3__ = (StrictEqualityComparison input clauseSelector)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
