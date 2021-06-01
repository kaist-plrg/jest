package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IntegerIndexedElementSet extends Algorithm {
  val name: String = "IntegerIndexedElementSet"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedElementSet" (O, index, value) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    if (= O["ContentType"] CONST_BigInt) {
      app __x1__ = (ToBigInt value)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let numValue = __x1__
    } else {
      app __x2__ = (ToNumber value)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numValue = __x2__
    }
    let buffer = O["ViewedArrayBuffer"]
    app __x3__ = (IsDetachedBuffer buffer)
    if (= __x3__ true) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (IsValidIntegerIndex O index)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    if (= __x5__ false) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    let elementSize = GLOBAL_typedArrayInfo[arrayTypeName]["ElementSize"]
    let indexedPosition = (+ (* index elementSize) offset)
    let elementType = GLOBAL_typedArrayInfo[arrayTypeName]["ElementType"]
    app __x7__ = (SetValueInBuffer buffer indexedPosition elementType numValue true CONST_Unordered)
    __x7__
    app __x8__ = (WrapCompletion true)
    return __x8__
  }"""), this)
}
