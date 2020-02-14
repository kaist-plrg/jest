package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingProperty0PropertyBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty0PropertyBindingInitialization0""", List(Id("""this"""), Id("""SingleNameBinding"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""SingleNameBinding"""))), EStr("""BoundNames""")), IAccess(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), EINum(0L)), ILet(Id("""name"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""SingleNameBinding"""))), EStr("""KeyedBindingInitialization""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))), ERef(RefId(Id("""name"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""name"""))))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "BindingProperty0PropertyBindingInitialization0" (this, SingleNameBinding, value, environment) => {
    access __x0__ = (SingleNameBinding "BoundNames")
    access __x1__ = (__x0__ 0i)
    let name = __x1__
    access __x2__ = (SingleNameBinding "KeyedBindingInitialization")
    app __x3__ = (__x2__ value environment name)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion (new [name]))
    return __x4__
  }
  */
}
