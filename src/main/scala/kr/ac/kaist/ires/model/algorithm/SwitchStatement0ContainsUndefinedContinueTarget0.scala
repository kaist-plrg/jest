package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0ContainsUndefinedContinueTarget0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""SwitchStatement0ContainsUndefinedContinueTarget0" (this, Expression, CaseBlock, iterationSet, labelSet) => {
    access __x0__ = (CaseBlock "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }""")
}
