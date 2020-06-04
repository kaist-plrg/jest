package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression1HasCallInTailPosition0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""CallExpression1HasCallInTailPosition0" (this, SuperCall, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }""")
}
