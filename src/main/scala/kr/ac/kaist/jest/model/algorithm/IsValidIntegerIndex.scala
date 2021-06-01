package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsValidIntegerIndex extends Algorithm {
  val name: String = "IsValidIntegerIndex"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsValidIntegerIndex" (O, index) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    app __x1__ = (IsInteger index)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    if (= __x1__ false) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= index -0.0) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    if (|| (< index 0i) (! (< index O["ArrayLength"]))) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion true)
    return __x5__
  }"""), this)
}
