package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BitwiseXORExpression1HasCallInTailPosition0 extends Algorithm {
  val name: String = "BitwiseXORExpression1HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BitwiseXORExpression1HasCallInTailPosition0" (this, BitwiseXORExpression, BitwiseANDExpression, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
