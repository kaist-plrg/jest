package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1ContainsUndefinedBreakTarget0 extends Algorithm {
  val name: String = "CaseClauses1ContainsUndefinedBreakTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseClauses1ContainsUndefinedBreakTarget0" (this, CaseClauses, CaseClause, labelSet) => {
    access __x0__ = (CaseClauses "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (CaseClause "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }"""), this)
}
