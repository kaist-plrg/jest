package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem0TopLevelVarScopedDeclarations0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""StatementListItem0TopLevelVarScopedDeclarations0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (Statement "TopLevelVarScopedDeclarations")
      return __x0__
    } else {}
    access __x1__ = (Statement "VarScopedDeclarations")
    return __x1__
  }""")
}
