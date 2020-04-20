package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0HasCallInTailPosition1 {
  val length: Int = 0
  val func: Func = parseFunc(""""CaseClause0HasCallInTailPosition1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "HasCallInTailPosition")
      app __x1__ = (__x0__ call)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }""")
}
