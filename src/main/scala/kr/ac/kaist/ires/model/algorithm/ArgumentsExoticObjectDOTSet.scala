package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentsExoticObjectDOTSet {
  val length: Int = 3
  val func: Func = Func("""ArgumentsExoticObject.Set""", List(Id("""args"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""Receiver"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ILet(Id("""isMapped"""), EBool(false)), ISeq(List(ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x1__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), EBool(false))), ILet(Id("""setStatus"""), ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinarySet"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "ArgumentsExoticObject.Set" (args, P, V, Receiver) => {
    let args = args
    app __x0__ = (SameValue args Receiver)
    if (= __x0__ false) let isMapped = false else {
      let map = args["ParameterMap"]
      app __x1__ = (HasOwnProperty map P)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let isMapped = __x1__
    }
    if (= isMapped true) {
      app __x2__ = (Set map P V false)
      let setStatus = __x2__
    } else {}
    app __x3__ = (OrdinarySet args P V Receiver)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
