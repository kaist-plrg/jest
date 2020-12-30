package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONtoString extends Algorithm {
  val name: String = "NumberCOLONCOLONtoString"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::toString" (x) => {
    if (= x NaN) {
      app __x0__ = (WrapCompletion "NaN")
      return __x0__
    } else {}
    if (|| (= x 0i) (= x -0.0)) {
      app __x1__ = (WrapCompletion "0")
      return __x1__
    } else {}
    if (< x 0i) {
      access __x2__ = (PRIMITIVES Number)
      access __x3__ = (__x2__ "toString")
      app __x4__ = (__x3__ (- x))
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion (+ "-" __x4__))
      return __x5__
    } else {}
    if (= x Infinity) {
      app __x6__ = (WrapCompletion "Infinity")
      return __x6__
    } else {}
    return (convert x num2str)
  }"""), this)
}
