package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsUnresolvableReference {
  val length: Int = 1
  val func: Func = parseFunc(""""IsUnresolvableReference" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    if (= V["BaseValue"] undefined) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion false)
      return __x2__
    }
  }""")
}