package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ArrayExoticObject.DefineOwnProperty""", List(Id("""A"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IIf(EBOp(OEq, ERef(RefId(Id("""P"""))), EStr("""length""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ArraySetLength"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsArrayIndex"""))), List(ERef(RefId(Id("""P"""))))), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""))), ILet(Id("""oldLenDesc"""), ERef(RefId(Id("""__x4__""")))), ILet(Id("""oldLen"""), ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""index"""), ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""oldLen"""))))), EBOp(OEq, ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""oldLen"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))), IApp(Id("""__x9__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""oldLenDesc"""))))), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x9__""")))), IAssert(EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(true))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List()))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "ArrayExoticObject.DefineOwnProperty" (A, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (= P "length") {
      app __x1__ = (ArraySetLength A Desc)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {
      app __x3__ = (IsArrayIndex P)
      if __x3__ {
        app __x4__ = (OrdinaryGetOwnProperty A "length")
        let oldLenDesc = __x4__
        let oldLen = oldLenDesc["Value"]
        app __x5__ = (ToUint32 P)
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let index = __x5__
        if (&& (! (< index oldLen)) (= oldLenDesc["Writable"] false)) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        app __x7__ = (OrdinaryDefineOwnProperty A P Desc)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let succeeded = __x7__
        if (= succeeded false) {
          app __x8__ = (WrapCompletion false)
          return __x8__
        } else {}
        if (! (< index oldLen)) {
          oldLenDesc["Value"] = (+ index 1i)
          app __x9__ = (OrdinaryDefineOwnProperty A "length" oldLenDesc)
          let succeeded = __x9__
          assert (= succeeded true)
        } else {}
        app __x10__ = (WrapCompletion true)
        return __x10__
      } else {}
    }
    app __x11__ = (OrdinaryDefineOwnProperty A P Desc)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
