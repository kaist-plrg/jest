package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1LexicallyDeclaredNames0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Declaration"""))), EStr("""BoundNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "StatementListItem1LexicallyDeclaredNames0" (this, Declaration) => {
    access __x0__ = (Declaration "BoundNames")
    return __x0__
  }
  */
}
