package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement1LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement1LabelledEvaluation0" (this, Expression, Statement, labelSet) => {
    let V = undefined
    while true {
      access __x0__ = (Expression "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exprValue = __x1__
      app __x2__ = (ToBoolean exprValue)
      if (= __x2__ false) {
        app __x3__ = (NormalCompletion V)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      access __x5__ = (Statement "Evaluation")
      let stmtResult = __x5__
      app __x6__ = (LoopContinues stmtResult labelSet)
      if (= __x6__ false) {
        app __x7__ = (UpdateEmpty stmtResult V)
        app __x8__ = (Completion __x7__)
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      if (! (= stmtResult["Value"] CONST_empty)) V = stmtResult["Value"] else {}
    }
  }""")
}