package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem0TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem0TopLevelVarDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""TopLevelVarDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "LabelledItem0TopLevelVarDeclaredNames0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (Statement "TopLevelVarDeclaredNames")
      return __x0__
    } else {}
    access __x1__ = (Statement "VarDeclaredNames")
    return __x1__
  }
  */
}
