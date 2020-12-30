package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONlessThan extends Algorithm {
  val name: String = "NumberCOLONCOLONlessThan"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::lessThan" (x, y) => {
    if (= x NaN) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    if (= y NaN) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    if (= x y) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (&& (= x 0i) (= y -0.0)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    if (&& (= x -0.0) (= y 0i)) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    if (= x Infinity) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    if (= y Infinity) {
      app __x6__ = (WrapCompletion true)
      return __x6__
    } else {}
    if (= y -Infinity) {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    if (= x -Infinity) {
      app __x8__ = (WrapCompletion true)
      return __x8__
    } else {}
    return (< x y)
  }"""), this)
}
