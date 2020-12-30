package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StatementListItem1TopLevelVarScopedDeclarations0 extends Algorithm {
  val name: String = "StatementListItem1TopLevelVarScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem1TopLevelVarScopedDeclarations0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      access __x0__ = (HoistableDeclaration "DeclarationPart")
      let declaration = __x0__
      return (new [declaration])
    } else {}
    return (new [])
  }"""), this)
}
