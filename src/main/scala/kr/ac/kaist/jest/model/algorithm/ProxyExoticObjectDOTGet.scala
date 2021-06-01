package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ProxyExoticObjectDOTGet extends Algorithm {
  val name: String = "ProxyExoticObjectDOTGet"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ProxyExoticObject.Get" (O, P, Receiver) => {
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
    app __x3__ = (GetMethod handler "get")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let trap = __x3__
    if (= trap undefined) {
      app __x4__ = (target["Get"] target P Receiver)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Call trap handler (new [target, P, Receiver]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let trapResult = __x6__
    app __x7__ = (target["GetOwnProperty"] target P)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let targetDesc = __x7__
    if (&& (! (= targetDesc undefined)) (= targetDesc["Configurable"] false)) {
      app __x8__ = (IsDataDescriptor targetDesc)
      if (&& (= __x8__ true) (= targetDesc["Writable"] false)) {
        app __x9__ = (SameValue trapResult targetDesc["Value"])
        if (= __x9__ false) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x10__
        } else {}
      } else {}
      app __x11__ = (IsAccessorDescriptor targetDesc)
      if (&& (= __x11__ true) (= targetDesc["Get"] undefined)) if (! (= trapResult undefined)) {
        app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x12__
      } else {} else {}
    } else {}
    app __x13__ = (WrapCompletion trapResult)
    return __x13__
  }"""), this)
}
