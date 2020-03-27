package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentsExoticObjectDOTDelete {
  val length: Int = 1
  val func: Func = Func("""ArgumentsExoticObject.Delete""", List(Id("""args"""), Id("""P""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))), ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryDelete"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""result"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""result"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""Delete"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IExpr(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "ArgumentsExoticObject.Delete" (args, P) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let isMapped = __x0__
    app __x1__ = (OrdinaryDelete args P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let result = __x1__
    if (&& (= result true) (= isMapped true)) {
      app __x2__ = (map["Delete"] map P)
      __x2__
    } else {}
    app __x3__ = (WrapCompletion result)
    return __x3__
  }
  */
}
