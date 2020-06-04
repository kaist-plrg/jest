package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1LexicallyDeclaredNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""StatementListItem1LexicallyDeclaredNames0" (this, Declaration) => {
    access __x0__ = (Declaration "BoundNames")
    return __x0__
  }""")
}
