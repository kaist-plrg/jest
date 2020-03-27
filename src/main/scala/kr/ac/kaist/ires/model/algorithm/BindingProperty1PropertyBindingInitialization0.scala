package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingProperty1PropertyBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty1PropertyBindingInitialization0""", List(Id("""this"""), Id("""PropertyName"""), Id("""BindingElement"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")), ILet(Id("""P"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsCompletion(ERef(RefId(Id("""P""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""P""")), ERef(RefProp(RefId(Id("""P""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""P"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""P""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""KeyedBindingInitialization""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""P"""))))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "BindingProperty1PropertyBindingInitialization0" (this, PropertyName, BindingElement, value, environment) => {
    access __x0__ = (PropertyName "Evaluation")
    let P = __x0__
    if (is-completion P) if (= P["Type"] CONST_normal) P = P["Value"] else return P else {}
    P
    access __x1__ = (BindingElement "KeyedBindingInitialization")
    app __x2__ = (__x1__ value environment P)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion (new [P]))
    return __x3__
  }
  */
}
