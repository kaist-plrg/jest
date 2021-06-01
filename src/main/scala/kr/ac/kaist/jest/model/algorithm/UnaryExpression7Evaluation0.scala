package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UnaryExpression7Evaluation0 extends Algorithm {
  val name: String = "UnaryExpression7Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression7Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    if (= oldValue true) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion true)
    return __x4__
  }"""), this)
}
