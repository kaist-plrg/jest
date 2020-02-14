package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsInTailPosition {
  val length: Int = 1
  val func: Func = Func("""IsInTailPosition""", List(Id("""call""")), None, ISeq(List(IIf(EBool(true), IReturn(EBool(false)), ISeq(List())), IExpr(ENotSupported("""Etc""")), ILet(Id("""body"""), ENotSupported("""ParentNode""")), IIf(EBOp(OEq, ERef(RefId(Id("""body"""))), ENotSupported("""ParentNode""")), IReturn(EBool(false)), ISeq(List())), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IAccess(Id("""__x0__"""), ERef(RefId(Id("""body"""))), EStr("""HasCallInTailPosition""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "IsInTailPosition" (call) => {
    if true return false else {}
    !!! "Etc"
    let body = !!! "ParentNode"
    if (= body !!! "ParentNode") return false else {}
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    access __x0__ = (body "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    return __x1__
  }
  */
}
