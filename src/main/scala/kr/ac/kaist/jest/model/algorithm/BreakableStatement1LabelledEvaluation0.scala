package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BreakableStatement1LabelledEvaluation0 extends Algorithm {
  val name: String = "BreakableStatement1LabelledEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BreakableStatement1LabelledEvaluation0" (this, SwitchStatement, labelSet) => {
    access __x0__ = (SwitchStatement "Evaluation")
    let stmtResult = __x0__
    if (= stmtResult["Type"] CONST_break) if (= stmtResult["Target"] CONST_empty) if (= stmtResult["Value"] CONST_empty) {
      app __x1__ = (NormalCompletion undefined)
      stmtResult = __x1__
    } else {
      app __x2__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x2__
    } else {} else {}
    app __x3__ = (Completion stmtResult)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
