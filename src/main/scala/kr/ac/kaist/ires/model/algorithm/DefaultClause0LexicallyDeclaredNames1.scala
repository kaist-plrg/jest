package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0LexicallyDeclaredNames1 {
  val length: Int = 0
  val func: Func = parseFunc(""""DefaultClause0LexicallyDeclaredNames1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }""")
}