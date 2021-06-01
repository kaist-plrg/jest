package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement0LabelledEvaluation0 extends Algorithm {
  val name: String = "IterationStatement0LabelledEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement0LabelledEvaluation0" (this, Statement, Expression, labelSet) => {
    let V = undefined
    while true {
      access __x0__ = (Statement "Evaluation")
      let stmtResult = __x0__
      app __x1__ = (LoopContinues stmtResult labelSet)
      if (= __x1__ false) {
        app __x2__ = (UpdateEmpty stmtResult V)
        app __x3__ = (Completion __x2__)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      if (! (= stmtResult["Value"] CONST_empty)) V = stmtResult["Value"] else {}
      access __x5__ = (Expression "Evaluation")
      let exprRef = __x5__
      app __x6__ = (GetValue exprRef)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let exprValue = __x6__
      app __x7__ = (ToBoolean exprValue)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      if (= __x7__ false) {
        app __x8__ = (NormalCompletion V)
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
    }
  }"""), this)
}
