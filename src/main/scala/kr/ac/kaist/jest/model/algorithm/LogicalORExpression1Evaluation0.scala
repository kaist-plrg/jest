package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LogicalORExpression1Evaluation0 extends Algorithm {
  val name: String = "LogicalORExpression1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LogicalORExpression1Evaluation0" (this, LogicalORExpression, LogicalANDExpression) => {
    access __x0__ = (LogicalORExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    app __x2__ = (ToBoolean lval)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let lbool = __x2__
    if (= lbool true) {
      app __x3__ = (WrapCompletion lval)
      return __x3__
    } else {}
    access __x4__ = (LogicalANDExpression "Evaluation")
    let rref = __x4__
    app __x5__ = (GetValue rref)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
