package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OptionalChain6HasCallInTailPosition0 extends Algorithm {
  val name: String = "OptionalChain6HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalChain6HasCallInTailPosition0" (this, OptionalChain, IdentifierName, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
