package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = parseFunc(""""CaseClauses1ContainsDuplicateLabels0" (this, CaseClauses, CaseClause, labelSet) => {
    access __x0__ = (CaseClauses "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (CaseClause "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }""")
}