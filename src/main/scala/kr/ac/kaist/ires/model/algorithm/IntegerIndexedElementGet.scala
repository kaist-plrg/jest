package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedElementGet {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedElementGet""", List(Id("""O"""), Id("""index""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""index"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number"""))))), ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""length""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""offset"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ByteOffset""")))), ILet(Id("""arrayTypeName"""), ERef(RefProp(RefId(Id("""O""")), EStr("""TypedArrayName""")))), IExpr(ENotSupported("""Etc""")), ILet(Id("""indexedPosition"""), EBOp(OPlus, EBOp(OMul, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementSize""")))), ERef(RefId(Id("""offset"""))))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetValueFromBuffer"""))), List(ERef(RefId(Id("""buffer"""))), ERef(RefId(Id("""indexedPosition"""))), ERef(RefId(Id("""elementType"""))), EBool(true), EStr("""Unordered"""))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "IntegerIndexedElementGet" (O, index) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    let buffer = O["ViewedArrayBuffer"]
    app __x1__ = (IsDetachedBuffer buffer)
    if (= __x1__ true) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (IsInteger index)
    if (= __x3__ false) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    if (= index -0.0) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {}
    let length = O["ArrayLength"]
    if (|| (< index 0i) (! (< index length))) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    !!! "Etc"
    let indexedPosition = (+ (* index elementSize) offset)
    !!! "Etc"
    app __x7__ = (GetValueFromBuffer buffer indexedPosition elementType true "Unordered")
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
