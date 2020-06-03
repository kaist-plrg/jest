package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0HasCallInTailPosition0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""SwitchStatement0HasCallInTailPosition0" (this, Expression, CaseBlock, call) => {
    access __x0__ = (CaseBlock "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
