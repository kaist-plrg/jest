package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0ContainsUndefinedBreakTarget1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""DefaultClause0ContainsUndefinedBreakTarget1" (this, StatementList, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedBreakTarget")
      app __x1__ = (__x0__ labelSet)
      return __x1__
    } else {}
    return false
  }""")
}
