package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression6HasCallInTailPosition0 extends Algorithm {
  val name: String = "CallExpression6HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression6HasCallInTailPosition0" (this, CallExpression, TemplateLiteral, call) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }"""), this)
}
