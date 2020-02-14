package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAnonymousFunctionDefinition {
  val length: Int = 1
  val func: Func = Func("""IsAnonymousFunctionDefinition""", List(Id("""expr""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""expr"""))), EStr("""IsFunctionDefinition""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), IReturn(EBool(false)), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""HasName""")), ILet(Id("""hasName"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""hasName"""))), EBool(true)), IReturn(EBool(false)), ISeq(List())), IReturn(EBool(true)))))
  /* Beautified form:
  "IsAnonymousFunctionDefinition" (expr) => {
    access __x0__ = (expr "IsFunctionDefinition")
    if (= __x0__ false) return false else {}
    access __x1__ = (expr "HasName")
    let hasName = __x1__
    if (= hasName true) return false else {}
    return true
  }
  */
}
