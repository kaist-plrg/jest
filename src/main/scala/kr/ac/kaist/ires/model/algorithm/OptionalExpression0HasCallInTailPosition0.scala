package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OptionalExpression0HasCallInTailPosition0 extends Algorithm {
  val name: String = "OptionalExpression0HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalExpression0HasCallInTailPosition0" (this, MemberExpression, OptionalChain, call) => {
    access __x0__ = (OptionalChain "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
