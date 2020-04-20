package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0HasCallInTailPosition0 {
  val length: Int = 0
  val func: Func = parseFunc(""""Catch0HasCallInTailPosition0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
