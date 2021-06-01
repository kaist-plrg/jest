package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CanonicalNumericIndexString extends Algorithm {
  val name: String = "CanonicalNumericIndexString"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CanonicalNumericIndexString" (argument) => {
    app __x0__ = (Type argument)
    assert (= __x0__ String)
    if (= argument "-0") {
      app __x1__ = (WrapCompletion -0.0)
      return __x1__
    } else {}
    app __x2__ = (ToNumber argument)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let n = __x2__
    app __x3__ = (ToString n)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (SameValue __x3__ argument)
    if (= __x4__ false) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion n)
    return __x6__
  }"""), this)
}
