package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ReturnStatement1HasCallInTailPosition0 extends Algorithm {
  val name: String = "ReturnStatement1HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ReturnStatement1HasCallInTailPosition0" (this, Expression, call) => {
    access __x0__ = (Expression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
