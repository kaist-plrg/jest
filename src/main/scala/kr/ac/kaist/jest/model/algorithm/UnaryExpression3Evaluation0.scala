package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UnaryExpression3Evaluation0 extends Algorithm {
  val name: String = "UnaryExpression3Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression3Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let val = __x0__
    if (is-completion val) if (= val["Type"] CONST_normal) val = val["Value"] else return val else {}
    val
    app __x1__ = (Type val)
    if (= __x1__ Reference) {
      app __x2__ = (IsUnresolvableReference val)
      if (= __x2__ true) {
        app __x3__ = (WrapCompletion "undefined")
        return __x3__
      } else {}
    } else {}
    app __x4__ = (GetValue val)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    val = __x4__
    app __x5__ = (GetTypeOf val)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
