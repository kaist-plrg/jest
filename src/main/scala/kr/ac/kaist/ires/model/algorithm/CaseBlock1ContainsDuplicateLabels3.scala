package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1ContainsDuplicateLabels3 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseBlock1ContainsDuplicateLabels3" (this, CaseClauses0, DefaultClause, CaseClauses1, labelSet) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "ContainsDuplicateLabels")
      app __x1__ = (__x0__ labelSet)
      let hasDuplicates = __x1__
      if (= hasDuplicates true) return true else {}
    } else {}
    access __x2__ = (DefaultClause "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    let hasDuplicates = __x3__
    if (= hasDuplicates true) return true else {}
    if (= CaseClauses1 absent) return false else {}
    access __x4__ = (CaseClauses1 "ContainsDuplicateLabels")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }"""))
}
