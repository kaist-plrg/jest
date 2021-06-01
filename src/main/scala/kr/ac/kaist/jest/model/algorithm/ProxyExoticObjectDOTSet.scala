package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ProxyExoticObjectDOTSet extends Algorithm {
  val name: String = "ProxyExoticObjectDOTSet"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ProxyExoticObject.Set" (O, P, V, Receiver) => {
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
    app __x3__ = (GetMethod handler "set")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let trap = __x3__
    if (= trap undefined) {
      app __x4__ = (target["Set"] target P V Receiver)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Call trap handler (new [target, P, V, Receiver]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (ToBoolean __x6__)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let booleanTrapResult = __x7__
    if (= booleanTrapResult false) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    app __x9__ = (target["GetOwnProperty"] target P)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let targetDesc = __x9__
    if (&& (! (= targetDesc undefined)) (= targetDesc["Configurable"] false)) {
      app __x10__ = (IsDataDescriptor targetDesc)
      if (&& (= __x10__ true) (= targetDesc["Writable"] false)) {
        app __x11__ = (SameValue V targetDesc["Value"])
        if (= __x11__ false) {
          app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x12__
        } else {}
      } else {}
      app __x13__ = (IsAccessorDescriptor targetDesc)
      if (= __x13__ true) if (= targetDesc["Set"] undefined) {
        app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x14__
      } else {} else {}
    } else {}
    app __x15__ = (WrapCompletion true)
    return __x15__
  }"""), this)
}
