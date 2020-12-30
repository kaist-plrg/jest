package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsSuperReference extends Algorithm {
  val name: String = "IsSuperReference"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsSuperReference" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    if (! (= V["thisValue"] absent)) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion false)
      return __x2__
    }
  }"""), this)
}
