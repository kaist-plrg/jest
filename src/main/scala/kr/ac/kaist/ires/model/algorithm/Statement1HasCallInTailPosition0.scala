package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement1HasCallInTailPosition0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""Statement1HasCallInTailPosition0" (this, VariableStatement, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }""")
}
