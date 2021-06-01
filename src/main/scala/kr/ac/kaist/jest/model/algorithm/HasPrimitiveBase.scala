package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object HasPrimitiveBase extends Algorithm {
  val name: String = "HasPrimitiveBase"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""HasPrimitiveBase" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (Type V["BaseValue"])
    if (|| (|| (|| (|| (= __x1__ Boolean) (= __x1__ String)) (= __x1__ Symbol)) (= __x1__ BigInt)) (= __x1__ Number)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {
      app __x3__ = (WrapCompletion false)
      return __x3__
    }
  }"""), this)
}
