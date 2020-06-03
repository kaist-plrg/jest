package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0LexicallyDeclaredNames1 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""CaseClause0LexicallyDeclaredNames1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }""")
}
