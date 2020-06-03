package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""StatementListItem1TopLevelVarDeclaredNames0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      access __x0__ = (HoistableDeclaration "BoundNames")
      return __x0__
    } else {}
    return (new [])
  }""")
}
