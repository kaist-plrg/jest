package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression2HasCallInTailPosition0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""CallExpression2HasCallInTailPosition0" (this, CallExpression, Arguments, call) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }""")
}
