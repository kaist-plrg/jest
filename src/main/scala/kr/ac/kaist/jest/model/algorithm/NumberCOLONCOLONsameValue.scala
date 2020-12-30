package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONsameValue extends Algorithm {
  val name: String = "NumberCOLONCOLONsameValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::sameValue" (x, y) => {
    if (&& (= x NaN) (= y NaN)) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    if (&& (= x 0i) (= y -0.0)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (&& (= x -0.0) (= y 0i)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= x y) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }"""), this)
}
