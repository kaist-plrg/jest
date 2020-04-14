package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement3StatementRules3 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement3StatementRules3" (this, VariableDeclarationList, Expression0, Expression1, Statement) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
