package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateArrayFromList extends Algorithm {
  val name: String = "CreateArrayFromList"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateArrayFromList" (elements) => {
    app __x0__ = (ArrayCreate 0i)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    let n = 0i
    let __x1__ = elements
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let e = __x1__[__x2__]
      app __x3__ = (ToString n)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (CreateDataPropertyOrThrow array __x3__ e)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      n = (+ n 1i)
      __x2__ = (+ __x2__ 1i)
    }
    app __x5__ = (WrapCompletion array)
    return __x5__
  }"""), this)
}
