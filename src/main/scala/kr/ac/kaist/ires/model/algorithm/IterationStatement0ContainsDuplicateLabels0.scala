package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement0ContainsDuplicateLabels0" (this, Statement, Expression, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }""")
}
