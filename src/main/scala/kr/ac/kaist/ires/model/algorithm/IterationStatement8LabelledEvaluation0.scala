package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement8LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement8LabelledEvaluation0" (this, LeftHandSideExpression, AssignmentExpression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) AssignmentExpression CONST_iterate)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation LeftHandSideExpression Statement keyResult CONST_iterate CONST_assignment labelSet)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}