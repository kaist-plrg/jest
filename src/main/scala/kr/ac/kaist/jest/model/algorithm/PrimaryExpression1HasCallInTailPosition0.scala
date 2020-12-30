package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression1HasCallInTailPosition0 extends Algorithm {
  val name: String = "PrimaryExpression1HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression1HasCallInTailPosition0" (this, IdentifierReference, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
