package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0VarScopedDeclarations1 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""DefaultClause0VarScopedDeclarations1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }""")
}
