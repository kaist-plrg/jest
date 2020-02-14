package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Declaration"""))), """Declaration0"""), ISeq(List(IAccess(Id("""HoistableDeclaration"""), ERef(RefId(Id("""Declaration"""))), EStr("""HoistableDeclaration""")), IAccess(Id("""__x0__"""), ERef(RefId(Id("""HoistableDeclaration"""))), EStr("""DeclarationPart""")), ILet(Id("""declaration"""), ERef(RefId(Id("""__x0__""")))), IReturn(EList(List(ERef(RefId(Id("""declaration""")))))))), ISeq(List())), IReturn(EList(List())))))
  /* Beautified form:
  "StatementListItem1TopLevelVarScopedDeclarations0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      access __x0__ = (HoistableDeclaration "DeclarationPart")
      let declaration = __x0__
      return (new [declaration])
    } else {}
    return (new [])
  }
  */
}
