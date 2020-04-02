package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0ContainsUndefinedContinueTarget1 {
  val length: Int = 0
  val func: Func = parseFunc(""""DefaultClause0ContainsUndefinedContinueTarget1" (this, StatementList, iterationSet, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedContinueTarget")
      app __x1__ = (__x0__ iterationSet (new []))
      return __x1__
    } else {}
    return false
  }""")
}