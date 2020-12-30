package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.BUG_FIX
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UpdateExpression4Evaluation0 extends Algorithm {
  val name: String = "UpdateExpression4Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(if (BUG_FIX) fixed else es11), this)
  private def es11 = """"UpdateExpression4Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumeric __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    app T = (Type oldvalue)
    app newValue = (PRIMITIVES[T].subtract oldValue PRIMITIVES[T].unit)
    ! newValue
    app __x3__ = (PutValue expr newValue)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion newValue)
    return __x4__
  }"""
  private def fixed = """"UpdateExpression4Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumeric __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    app T = (Type oldValue)
    app newValue = (PRIMITIVES[T].subtract oldValue PRIMITIVES[T].unit)
    ! newValue
    app __x3__ = (PutValue expr newValue)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion newValue)
    return __x4__
  }"""
}
