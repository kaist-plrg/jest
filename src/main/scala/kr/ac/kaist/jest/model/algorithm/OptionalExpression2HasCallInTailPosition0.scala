package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OptionalExpression2HasCallInTailPosition0 extends Algorithm {
  val name: String = "OptionalExpression2HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalExpression2HasCallInTailPosition0" (this, OptionalExpression, OptionalChain, call) => {
    access __x0__ = (OptionalChain "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
