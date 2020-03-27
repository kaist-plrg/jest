package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedExoticObject.DefineOwnProperty""", List(Id("""O"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x2__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""numericIndex"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), ERef(RefId(Id("""length"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(true))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EBool(false))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent)), ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))), IApp(Id("""__x13__"""), ERef(RefId(Id("""IntegerIndexedElementSet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""numericIndex"""))), ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x15__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))), IReturn(ERef(RefId(Id("""__x17__""")))))))
  /* Beautified form:
  "IntegerIndexedExoticObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ String) {
      app __x2__ = (CanonicalNumericIndexString P)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numericIndex = __x2__
      if (! (= numericIndex undefined)) {
        app __x3__ = (IsInteger numericIndex)
        if (= __x3__ false) {
          app __x4__ = (WrapCompletion false)
          return __x4__
        } else {}
        if (= numericIndex -0.0) {
          app __x5__ = (WrapCompletion false)
          return __x5__
        } else {}
        if (< numericIndex 0i) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        let length = O["ArrayLength"]
        if (! (< numericIndex length)) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        app __x8__ = (IsAccessorDescriptor Desc)
        if (= __x8__ true) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        if (&& (! (= Desc["Configurable"] absent)) (= Desc["Configurable"] true)) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {}
        if (&& (! (= Desc["Enumerable"] absent)) (= Desc["Enumerable"] false)) {
          app __x11__ = (WrapCompletion false)
          return __x11__
        } else {}
        if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] false)) {
          app __x12__ = (WrapCompletion false)
          return __x12__
        } else {}
        if (! (= Desc["Value"] absent)) {
          let value = Desc["Value"]
          app __x13__ = (IntegerIndexedElementSet O numericIndex value)
          if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          app __x14__ = (WrapCompletion __x13__)
          return __x14__
        } else {}
        app __x15__ = (WrapCompletion true)
        return __x15__
      } else {}
    } else {}
    app __x16__ = (OrdinaryDefineOwnProperty O P Desc)
    if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
    app __x17__ = (WrapCompletion __x16__)
    return __x17__
  }
  */
}
