package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IntegerIndexedElementGet extends Algorithm {
  val name: String = "IntegerIndexedElementGet"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedElementGet" (O, index) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    let buffer = O["ViewedArrayBuffer"]
    app __x1__ = (IsDetachedBuffer buffer)
    if (= __x1__ true) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (IsValidIntegerIndex O index)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    if (= __x3__ false) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    let elementSize = GLOBAL_typedArrayInfo[arrayTypeName]["ElementSize"]
    let indexedPosition = (+ (* index elementSize) offset)
    let elementType = GLOBAL_typedArrayInfo[arrayTypeName]["ElementType"]
    app __x5__ = (GetValueFromBuffer buffer indexedPosition elementType true CONST_Unordered)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
