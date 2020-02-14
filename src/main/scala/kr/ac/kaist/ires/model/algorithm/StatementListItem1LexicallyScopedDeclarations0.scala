package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Declaration"""))), EStr("""DeclarationPart""")), IReturn(EList(List(ERef(RefId(Id("""__x0__""")))))))))
  /* Beautified form:
  "StatementListItem1LexicallyScopedDeclarations0" (this, Declaration) => {
    access __x0__ = (Declaration "DeclarationPart")
    return (new [__x0__])
  }
  */
}
