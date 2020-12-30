package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StatementListItem1LexicallyDeclaredNames0 extends Algorithm {
  val name: String = "StatementListItem1LexicallyDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem1LexicallyDeclaredNames0" (this, Declaration) => {
    access __x0__ = (Declaration "BoundNames")
    return __x0__
  }"""), this)
}
