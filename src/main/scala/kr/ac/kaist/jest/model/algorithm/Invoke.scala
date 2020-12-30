package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Invoke extends Algorithm {
  val name: String = "Invoke"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Invoke" (V, P, argumentsList) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (= argumentsList absent) argumentsList = (new []) else {}
    app __x1__ = (GetV V P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let func = __x1__
    app __x2__ = (Call func V argumentsList)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
