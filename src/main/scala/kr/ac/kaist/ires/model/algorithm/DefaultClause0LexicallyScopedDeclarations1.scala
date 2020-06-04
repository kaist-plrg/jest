package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0LexicallyScopedDeclarations1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""DefaultClause0LexicallyScopedDeclarations1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }""")
}
