package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SameValueZero extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""SameValueZero" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (! (= __x0__ __x1__)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (= __x3__ Number) {
      if (&& (= x NaN) (= y NaN)) {
        app __x4__ = (WrapCompletion true)
        return __x4__
      } else {}
      if (&& (= x 0i) (= y -0.0)) {
        app __x5__ = (WrapCompletion true)
        return __x5__
      } else {}
      if (&& (= x -0.0) (= y 0i)) {
        app __x6__ = (WrapCompletion true)
        return __x6__
      } else {}
      if (= x y) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    app __x9__ = (SameValueNonNumber x y)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }""")
}
