package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0VarDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0VarDeclaredNames1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IReturn(EList(List())))))
  /* Beautified form:
  "DefaultClause0VarDeclaredNames1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
