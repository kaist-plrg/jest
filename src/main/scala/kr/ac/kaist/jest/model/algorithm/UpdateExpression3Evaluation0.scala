package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.BUG_FIX
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UpdateExpression3Evaluation0 extends Algorithm {
  val name: String = "UpdateExpression3Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(if (BUG_FIX) fixed else es11), this)
  private def es11 = """"UpdateExpression3Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumeric __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    app __x3__ = (Type oldvalue)
    app __x4__ = (PRIMITIVES[__x3__].add oldValue PRIMITIVES[__x3__].unit)
    ! __x4__
    let newValue = __x4__
    app __x5__ = (PutValue expr newValue)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion newValue)
    return __x6__
  }"""
  private def fixed = """"UpdateExpression3Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumeric __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    app __x3__ = (Type oldValue)
    app __x4__ = (PRIMITIVES[__x3__].add oldValue PRIMITIVES[__x3__].unit)
    ! __x4__
    let newValue = __x4__
    app __x5__ = (PutValue expr newValue)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion newValue)
    return __x6__
  }"""
}
