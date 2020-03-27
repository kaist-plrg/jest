package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ExponentiationExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ExponentiationExpression1Evaluation0""", List(Id("""this"""), Id("""UpdateExpression"""), Id("""ExponentiationExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UpdateExpression"""))), EStr("""Evaluation""")), ILet(Id("""left"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""left"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""leftValue"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ExponentiationExpression"""))), EStr("""Evaluation""")), ILet(Id("""right"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""right"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""rightValue"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""leftValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""base"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rightValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""exponent"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPow, ERef(RefId(Id("""base"""))), ERef(RefId(Id("""exponent""")))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "ExponentiationExpression1Evaluation0" (this, UpdateExpression, ExponentiationExpression) => {
    access __x0__ = (UpdateExpression "Evaluation")
    let left = __x0__
    app __x1__ = (GetValue left)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let leftValue = __x1__
    access __x2__ = (ExponentiationExpression "Evaluation")
    let right = __x2__
    app __x3__ = (GetValue right)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rightValue = __x3__
    app __x4__ = (ToNumber leftValue)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let base = __x4__
    app __x5__ = (ToNumber rightValue)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let exponent = __x5__
    app __x6__ = (WrapCompletion (** base exponent))
    return __x6__
  }
  */
}
