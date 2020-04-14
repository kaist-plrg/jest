package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement3ContainsDuplicateLabels3 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement3ContainsDuplicateLabels3" (this, VariableDeclarationList, Expression0, Expression1, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }""")
}
