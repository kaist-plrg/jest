package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentsExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""ArgumentsExoticObject.GetOwnProperty""", List(Id("""args"""), Id("""P""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))))), ILet(Id("""desc"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""desc"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Value""")), ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""desc"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "ArgumentsExoticObject.GetOwnProperty" (args, P) => {
    let args = args
    app __x0__ = (OrdinaryGetOwnProperty args P)
    let desc = __x0__
    if (= desc undefined) {
      app __x1__ = (WrapCompletion desc)
      return __x1__
    } else {}
    let map = args["ParameterMap"]
    app __x2__ = (HasOwnProperty map P)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let isMapped = __x2__
    if (= isMapped true) {
      app __x3__ = (Get map P)
      desc["Value"] = __x3__
    } else {}
    app __x4__ = (WrapCompletion desc)
    return __x4__
  }
  */
}
