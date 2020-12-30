package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsPropertyKey extends Algorithm {
  val name: String = "IsPropertyKey"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsPropertyKey" (argument) => {
    app __x0__ = (Type argument)
    if (= __x0__ String) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (Type argument)
    if (= __x2__ Symbol) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }"""), this)
}
