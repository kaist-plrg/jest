package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0ContainsUndefinedBreakTarget0 extends Algorithm {
  val name: String = "SwitchStatement0ContainsUndefinedBreakTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SwitchStatement0ContainsUndefinedBreakTarget0" (this, Expression, CaseBlock, labelSet) => {
    access __x0__ = (CaseBlock "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }"""), this)
}
