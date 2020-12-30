package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression10HasCallInTailPosition0 extends Algorithm {
  val name: String = "PrimaryExpression10HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression10HasCallInTailPosition0" (this, RegularExpressionLiteral, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
