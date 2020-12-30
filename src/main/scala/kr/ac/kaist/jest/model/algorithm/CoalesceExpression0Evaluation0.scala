package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CoalesceExpression0Evaluation0 extends Algorithm {
  val name: String = "CoalesceExpression0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoalesceExpression0Evaluation0" (this, CoalesceExpressionHead, BitwiseORExpression) => {
    access __x0__ = (CoalesceExpressionHead "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    if (|| (= lval undefined) (= lval null)) {
      access __x2__ = (BitwiseORExpression "Evaluation")
      let rref = __x2__
      app __x3__ = (GetValue rref)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {
      app __x5__ = (WrapCompletion lval)
      return __x5__
    }
  }"""), this)
}
