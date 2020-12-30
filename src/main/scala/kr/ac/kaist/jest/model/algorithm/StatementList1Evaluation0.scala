package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StatementList1Evaluation0 extends Algorithm {
  val name: String = "StatementList1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementList1Evaluation0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "Evaluation")
    let sl = __x0__
    if (is-completion sl) if (= sl["Type"] CONST_normal) sl = sl["Value"] else return sl else {}
    sl
    access __x1__ = (StatementListItem "Evaluation")
    let s = __x1__
    app __x2__ = (UpdateEmpty s sl)
    app __x3__ = (Completion __x2__)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
