package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0Evaluation1 {
  val length: Int = 0
  val func: Func = parseFunc(""""DefaultClause0Evaluation1" (this, StatementList) => {
    access __x0__ = (StatementList "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
