package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentsExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ArgumentsExoticObject.DefineOwnProperty""", List(Id("""args"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))), ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""newArgDesc"""), ERef(RefId(Id("""Desc""")))), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true))), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x1__"""))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IAssign(RefId(Id("""newArgDesc""")), ECopy(ERef(RefId(Id("""Desc"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IAssign(RefProp(RefId(Id("""newArgDesc""")), EStr("""Value""")), ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""newArgDesc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""allowed"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""allowed"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""Delete"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IExpr(ERef(RefId(Id("""__x7__""")))))), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EBool(false))), ILet(Id("""setStatus"""), ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""Delete"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))), IExpr(ERef(RefId(Id("""__x9__""")))))), ISeq(List()))))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x10__""")))))))
  /* Beautified form:
  "ArgumentsExoticObject.DefineOwnProperty" (args, P, Desc) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    let isMapped = __x0__
    let newArgDesc = Desc
    let __x1__ = (= isMapped true)
    if __x1__ {
      app __x2__ = (IsDataDescriptor Desc)
      __x1__ = (= __x2__ true)
    } else {}
    if __x1__ if (&& (= Desc["Value"] absent) (= Desc["Writable"] false)) {
      newArgDesc = (copy-obj Desc)
      app __x3__ = (Get map P)
      newArgDesc["Value"] = __x3__
    } else {} else {}
    app __x4__ = (OrdinaryDefineOwnProperty args P newArgDesc)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let allowed = __x4__
    if (= allowed false) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    if (= isMapped true) {
      app __x6__ = (IsAccessorDescriptor Desc)
      if (= __x6__ true) {
        app __x7__ = (map["Delete"] map P)
        __x7__
      } else {
        if (! (= Desc["Value"] absent)) {
          app __x8__ = (Set map P Desc["Value"] false)
          let setStatus = __x8__
        } else {}
        if (= Desc["Writable"] false) {
          app __x9__ = (map["Delete"] map P)
          __x9__
        } else {}
      }
    } else {}
    app __x10__ = (WrapCompletion true)
    return __x10__
  }
  */
}
