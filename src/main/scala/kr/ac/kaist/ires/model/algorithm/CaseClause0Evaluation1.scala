package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0Evaluation1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""CaseClause0Evaluation1" (this, Expression, StatementList) => {
    access __x0__ = (StatementList "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
