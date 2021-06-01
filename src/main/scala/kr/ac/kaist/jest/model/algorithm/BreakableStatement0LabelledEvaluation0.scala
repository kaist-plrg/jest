package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BreakableStatement0LabelledEvaluation0 extends Algorithm {
  val name: String = "BreakableStatement0LabelledEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BreakableStatement0LabelledEvaluation0" (this, IterationStatement, labelSet) => {
    access __x0__ = (IterationStatement "LabelledEvaluation")
    app __x1__ = (__x0__ labelSet)
    let stmtResult = __x1__
    if (= stmtResult["Type"] CONST_break) if (= stmtResult["Target"] CONST_empty) if (= stmtResult["Value"] CONST_empty) {
      app __x2__ = (NormalCompletion undefined)
      stmtResult = __x2__
    } else {
      app __x3__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x3__
    } else {} else {}
    app __x4__ = (Completion stmtResult)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
