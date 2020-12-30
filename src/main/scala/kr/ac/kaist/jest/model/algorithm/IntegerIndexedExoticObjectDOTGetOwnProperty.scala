package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IntegerIndexedExoticObjectDOTGetOwnProperty extends Algorithm {
  val name: String = "IntegerIndexedExoticObjectDOTGetOwnProperty"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedExoticObject.GetOwnProperty" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ String) {
      app __x2__ = (CanonicalNumericIndexString P)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numericIndex = __x2__
      if (! (= numericIndex undefined)) {
        app __x3__ = (IntegerIndexedElementGet O numericIndex)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let value = __x3__
        if (= value undefined) {
          app __x4__ = (WrapCompletion undefined)
          return __x4__
        } else {}
        app __x5__ = (WrapCompletion (new PropertyDescriptor("Value" -> value, "Writable" -> true, "Enumerable" -> true, "Configurable" -> false)))
        return __x5__
      } else {}
    } else {}
    app __x6__ = (OrdinaryGetOwnProperty O P)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
