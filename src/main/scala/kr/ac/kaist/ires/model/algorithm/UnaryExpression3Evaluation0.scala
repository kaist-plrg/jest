package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression3Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")), ILet(Id("""val"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsCompletion(ERef(RefId(Id("""val""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""val""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""val""")), ERef(RefProp(RefId(Id("""val""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""val"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""val""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""val"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Reference""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""val"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""undefined"""))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""val"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IAssign(RefId(Id("""val""")), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetTypeOf"""))), List(ERef(RefId(Id("""val"""))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "UnaryExpression3Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let val = __x0__
    if (is-completion val) if (= val["Type"] CONST_normal) val = val["Value"] else return val else {}
    val
    app __x1__ = (Type val)
    if (= __x1__ Reference) {
      app __x2__ = (IsUnresolvableReference val)
      if (= __x2__ true) {
        app __x3__ = (WrapCompletion "undefined")
        return __x3__
      } else {}
    } else {}
    app __x4__ = (GetValue val)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    val = __x4__
    app __x5__ = (GetTypeOf val)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
