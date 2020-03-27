package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedExoticObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = Func("""IntegerIndexedExoticObject.HasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x2__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""numericIndex"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IIf(EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), EINum(0L)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""numericIndex"""))), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength"""))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""OrdinaryHasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "IntegerIndexedExoticObject.HasProperty" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ String) {
      app __x2__ = (CanonicalNumericIndexString P)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numericIndex = __x2__
      if (! (= numericIndex undefined)) {
        let buffer = O["ViewedArrayBuffer"]
        app __x3__ = (IsDetachedBuffer buffer)
        if (= __x3__ true) {
          app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x4__
        } else {}
        app __x5__ = (IsInteger numericIndex)
        if (= __x5__ false) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        if (= numericIndex -0.0) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        if (< numericIndex 0i) {
          app __x8__ = (WrapCompletion false)
          return __x8__
        } else {}
        if (! (< numericIndex O["ArrayLength"])) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        app __x10__ = (WrapCompletion true)
        return __x10__
      } else {}
    } else {}
    app __x11__ = (OrdinaryHasProperty O P)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
