package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression3HasCallInTailPosition0 extends Algorithm {
  val name: String = "PrimaryExpression3HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression3HasCallInTailPosition0" (this, ArrayLiteral, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
