package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ExpressionBody0Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ExpressionBody0Evaluation0" (this, AssignmentExpression) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let exprValue = __x1__
    app __x2__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> exprValue, "Target" -> CONST_empty)))
    return __x2__
  }""")
}
