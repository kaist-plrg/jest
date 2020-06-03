package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IfStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""IfStatement0ContainsDuplicateLabels0" (this, Expression, Statement0, Statement1, labelSet) => {
    access __x0__ = (Statement0 "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicate = __x1__
    if (= hasDuplicate true) return true else {}
    access __x2__ = (Statement1 "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }""")
}
