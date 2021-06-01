package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ProxyExoticObjectDOTGetOwnProperty extends Algorithm {
  val name: String = "ProxyExoticObjectDOTGetOwnProperty"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ProxyExoticObject.GetOwnProperty" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (Type handler)
    assert (= __x2__ Object)
    let target = O["ProxyTarget"]
    app __x3__ = (GetMethod handler "getOwnPropertyDescriptor")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let trap = __x3__
    if (= trap undefined) {
      app __x4__ = (target["GetOwnProperty"] target P)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Call trap handler (new [target, P]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let trapResultObj = __x6__
    app __x7__ = (Type trapResultObj)
    if (! (|| (= __x7__ Object) (= __x7__ Undefined))) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    app __x9__ = (target["GetOwnProperty"] target P)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let targetDesc = __x9__
    if (= trapResultObj undefined) {
      if (= targetDesc undefined) {
        app __x10__ = (WrapCompletion undefined)
        return __x10__
      } else {}
      if (= targetDesc["Configurable"] false) {
        app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x11__
      } else {}
      app __x12__ = (IsExtensible target)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let extensibleTarget = __x12__
      if (= extensibleTarget false) {
        app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x13__
      } else {}
      app __x14__ = (WrapCompletion undefined)
      return __x14__
    } else {}
    app __x15__ = (IsExtensible target)
    if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
    let extensibleTarget = __x15__
    app __x16__ = (ToPropertyDescriptor trapResultObj)
    if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
    let resultDesc = __x16__
    app __x17__ = (CompletePropertyDescriptor resultDesc)
    __x17__
    app __x18__ = (IsCompatiblePropertyDescriptor extensibleTarget resultDesc targetDesc)
    let valid = __x18__
    if (= valid false) {
      app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x19__
    } else {}
    if (= resultDesc["Configurable"] false) {
      if (|| (= targetDesc undefined) (= targetDesc["Configurable"] true)) {
        app __x20__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x20__
      } else {}
      if (&& (! (= resultDesc["Writable"] absent)) (= resultDesc["Writable"] false)) if (= targetDesc["Writable"] true) {
        app __x21__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x21__
      } else {} else {}
    } else {}
    app __x22__ = (WrapCompletion resultDesc)
    return __x22__
  }"""), this)
}
