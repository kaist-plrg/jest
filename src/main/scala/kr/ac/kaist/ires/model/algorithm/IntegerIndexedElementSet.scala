package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedElementSet {
  val length: Int = 3
  val func: Func = Func("""IntegerIndexedElementSet""", List(Id("""O"""), Id("""index"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""index"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""value"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""numValue"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""buffer"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ViewedArrayBuffer""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefId(Id("""buffer"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""length""")))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), ILet(Id("""offset"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ByteOffset""")))), ILet(Id("""arrayTypeName"""), ERef(RefProp(RefId(Id("""O""")), EStr("""TypedArrayName""")))), IExpr(ENotSupported("""Etc""")), ILet(Id("""indexedPosition"""), EBOp(OPlus, EBOp(OMul, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementSize""")))), ERef(RefId(Id("""offset"""))))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x8__"""), ERef(RefId(Id("""SetValueInBuffer"""))), List(ERef(RefId(Id("""buffer"""))), ERef(RefId(Id("""indexedPosition"""))), ERef(RefId(Id("""elementType"""))), ERef(RefId(Id("""numValue"""))), EBool(true), EStr("""Unordered"""))), IExpr(ERef(RefId(Id("""__x8__""")))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x9__""")))))))
  /* Beautified form:
  "IntegerIndexedElementSet" (O, index, value) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    app __x1__ = (ToNumber value)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let numValue = __x1__
    let buffer = O["ViewedArrayBuffer"]
    app __x2__ = (IsDetachedBuffer buffer)
    if (= __x2__ true) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (IsInteger index)
    if (= __x4__ false) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    if (= index -0.0) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    let length = O["ArrayLength"]
    if (|| (< index 0i) (! (< index length))) {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    !!! "Etc"
    let indexedPosition = (+ (* index elementSize) offset)
    !!! "Etc"
    app __x8__ = (SetValueInBuffer buffer indexedPosition elementType numValue true "Unordered")
    __x8__
    app __x9__ = (WrapCompletion true)
    return __x9__
  }
  */
}
