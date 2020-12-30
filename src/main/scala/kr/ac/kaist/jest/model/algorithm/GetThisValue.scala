package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetThisValue extends Algorithm {
  val name: String = "GetThisValue"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetThisValue" (V) => {
    app __x0__ = (IsPropertyReference V)
    assert (= __x0__ true)
    app __x1__ = (IsSuperReference V)
    if (= __x1__ true) {
      app __x2__ = (WrapCompletion V["thisValue"])
      return __x2__
    } else {}
    app __x3__ = (GetBase V)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
