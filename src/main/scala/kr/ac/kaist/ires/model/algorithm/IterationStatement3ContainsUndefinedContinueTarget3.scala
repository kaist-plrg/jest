package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement3ContainsUndefinedContinueTarget3 {
  val length: Int = 0
  val func: Func = parseFunc(""""IterationStatement3ContainsUndefinedContinueTarget3" (this, VariableDeclarationList, Expression0, Expression1, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }""")
}
