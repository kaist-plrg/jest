package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = parseFunc(""""Catch0ContainsUndefinedBreakTarget0" (this, CatchParameter, Block, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }""")
}
