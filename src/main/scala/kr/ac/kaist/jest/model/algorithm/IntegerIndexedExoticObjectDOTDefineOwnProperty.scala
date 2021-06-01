package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IntegerIndexedExoticObjectDOTDefineOwnProperty extends Algorithm {
  val name: String = "IntegerIndexedExoticObjectDOTDefineOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedExoticObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ String) {
      app __x2__ = (CanonicalNumericIndexString P)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numericIndex = __x2__
      if (! (= numericIndex undefined)) {
        app __x3__ = (IsValidIntegerIndex O numericIndex)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        if (= __x3__ false) {
          app __x4__ = (WrapCompletion false)
          return __x4__
        } else {}
        app __x5__ = (IsAccessorDescriptor Desc)
        if (= __x5__ true) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        if (&& (! (= Desc["Configurable"] absent)) (= Desc["Configurable"] true)) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        if (&& (! (= Desc["Enumerable"] absent)) (= Desc["Enumerable"] false)) {
          app __x8__ = (WrapCompletion false)
          return __x8__
        } else {}
        if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] false)) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        if (! (= Desc["Value"] absent)) {
          let value = Desc["Value"]
          app __x10__ = (IntegerIndexedElementSet O numericIndex value)
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          app __x11__ = (WrapCompletion __x10__)
          return __x11__
        } else {}
        app __x12__ = (WrapCompletion true)
        return __x12__
      } else {}
    } else {}
    app __x13__ = (OrdinaryDefineOwnProperty O P Desc)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }"""), this)
}
