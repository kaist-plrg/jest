package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1StatementRules3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1StatementRules3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1""")), None, ISeq(List(ILet(Id("""has"""), EBool(false)), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""HasCallInTailPosition""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IAccess(Id("""__x3__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""HasCallInTailPosition""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))), ILet(Id("""has"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent)), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""HasCallInTailPosition""")), IApp(Id("""__x7__"""), ERef(RefId(Id("""__x6__"""))), List(ERef(RefId(Id("""call"""))))), ILet(Id("""has"""), ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""has"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "CaseBlock1StatementRules3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    let has = false
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "HasCallInTailPosition")
      app __x1__ = (__x0__ call)
      let has = __x1__
    } else {}
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (DefaultClause "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    let has = __x4__
    if (= has true) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (! (= CaseClauses1 absent)) {
      access __x6__ = (CaseClauses1 "HasCallInTailPosition")
      app __x7__ = (__x6__ call)
      let has = __x7__
    } else {}
    app __x8__ = (WrapCompletion has)
    return __x8__
  }
  */
}
