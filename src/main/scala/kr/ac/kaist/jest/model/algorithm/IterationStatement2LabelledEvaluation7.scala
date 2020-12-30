package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement2LabelledEvaluation7 extends Algorithm {
  val name: String = "IterationStatement2LabelledEvaluation7"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement2LabelledEvaluation7" (this, Expression0, Expression1, Expression2, Statement, labelSet) => {
    if (! (= Expression0 absent)) {
      access __x0__ = (Expression0 "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    app __x2__ = (ForBodyEvaluation Expression1 Expression2 Statement (new []) labelSet)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
