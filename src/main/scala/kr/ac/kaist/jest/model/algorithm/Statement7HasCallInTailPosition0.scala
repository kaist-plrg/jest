package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Statement7HasCallInTailPosition0 extends Algorithm {
  val name: String = "Statement7HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement7HasCallInTailPosition0" (this, BreakStatement, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
