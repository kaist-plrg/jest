package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingPattern0BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingPattern0BindingInitialization0""", List(Id("""this"""), Id("""ObjectBindingPattern"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ObjectBindingPattern"""))), EStr("""BindingInitialization""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "BindingPattern0BindingInitialization0" (this, ObjectBindingPattern, value, environment) => {
    app __x0__ = (RequireObjectCoercible value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (ObjectBindingPattern "BindingInitialization")
    app __x2__ = (__x1__ value environment)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
