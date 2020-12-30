package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IntegerIndexedExoticObjectDOTHasProperty extends Algorithm {
  val name: String = "IntegerIndexedExoticObjectDOTHasProperty"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedExoticObject.HasProperty" (O, P) => {
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
        app __x5__ = (IsValidIntegerIndex O numericIndex)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        if (= __x5__ false) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
    } else {}
    app __x8__ = (OrdinaryHasProperty O P)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
