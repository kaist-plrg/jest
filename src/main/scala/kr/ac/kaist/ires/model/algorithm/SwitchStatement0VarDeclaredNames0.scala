package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""VarDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "SwitchStatement0VarDeclaredNames0" (this, Expression, CaseBlock) => {
    access __x0__ = (CaseBlock "VarDeclaredNames")
    return __x0__
  }
  */
}
