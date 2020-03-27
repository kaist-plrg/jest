package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauseIsSelected {
  val length: Int = 2
  val func: Func = Func("""CaseClauseIsSelected""", List(Id("""C"""), Id("""input""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""C"""))), EStr("""Expression""")), IAccess(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), EStr("""Evaluation""")), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""clauseSelector"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""clauseSelector"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "CaseClauseIsSelected" (C, input) => {
    access __x0__ = (C "Expression")
    access __x1__ = (__x0__ "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let clauseSelector = __x2__
    app __x3__ = (StrictEqualityComparison input clauseSelector)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
