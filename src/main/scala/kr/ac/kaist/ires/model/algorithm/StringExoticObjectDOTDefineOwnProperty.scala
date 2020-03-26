package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""StringExoticObject.DefineOwnProperty""", List(Id("""S"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""StringGetOwnProperty"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""stringDesc"""), ERef(RefId(Id("""__x1__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""stringDesc"""))), EUndef)), ISeq(List(ILet(Id("""extensible"""), ERef(RefProp(RefId(Id("""S""")), EStr("""Extensible""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsCompatiblePropertyDescriptor"""))), List(ERef(RefId(Id("""extensible"""))), ERef(RefId(Id("""Desc"""))), ERef(RefId(Id("""stringDesc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "StringExoticObject.DefineOwnProperty" (S, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (StringGetOwnProperty S P)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let stringDesc = __x1__
    if (! (= stringDesc undefined)) {
      let extensible = S["Extensible"]
      app __x2__ = (IsCompatiblePropertyDescriptor extensible Desc stringDesc)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (OrdinaryDefineOwnProperty S P Desc)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
