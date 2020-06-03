package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""SwitchStatement0ContainsDuplicateLabels0" (this, Expression, CaseBlock, labelSet) => {
    access __x0__ = (CaseBlock "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }""")
}
