package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsSuperReference {
  val length: Int = 1
  val func: Func = parseFunc(""""IsSuperReference" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    if (! (= V["thisValue"] absent)) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion false)
      return __x2__
    }
  }""")
}