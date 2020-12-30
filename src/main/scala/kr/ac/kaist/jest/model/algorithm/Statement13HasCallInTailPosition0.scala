package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Statement13HasCallInTailPosition0 extends Algorithm {
  val name: String = "Statement13HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement13HasCallInTailPosition0" (this, DebuggerStatement, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
