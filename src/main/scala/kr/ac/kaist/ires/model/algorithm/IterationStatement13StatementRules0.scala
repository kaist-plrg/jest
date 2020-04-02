package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement13StatementRules0 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement13StatementRules0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}