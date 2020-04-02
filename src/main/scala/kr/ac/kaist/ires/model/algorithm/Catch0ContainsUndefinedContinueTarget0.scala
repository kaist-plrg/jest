package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = parseFunc(""""Catch0ContainsUndefinedContinueTarget0" (this, CatchParameter, Block, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }""")
}