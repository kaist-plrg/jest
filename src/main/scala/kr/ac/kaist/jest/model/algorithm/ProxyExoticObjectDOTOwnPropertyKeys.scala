package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ProxyExoticObjectDOTOwnPropertyKeys extends Algorithm {
  val name: String = "ProxyExoticObjectDOTOwnPropertyKeys"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ProxyExoticObject.OwnPropertyKeys" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (Type handler)
    assert (= __x1__ Object)
    let target = O["ProxyTarget"]
    app __x2__ = (GetMethod handler "ownKeys")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let trap = __x2__
    if (= trap undefined) {
      app __x3__ = (target["OwnPropertyKeys"] target)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (Call trap handler (new [target]))
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let trapResultArray = __x5__
    app __x6__ = (CreateListFromArrayLike trapResultArray (new [String, Symbol]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let trapResult = __x6__
    !!! "Etc"
    app __x7__ = (IsExtensible target)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let extensibleTarget = __x7__
    app __x8__ = (target["OwnPropertyKeys"] target)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let targetKeys = __x8__
    let targetConfigurableKeys = (new [])
    let targetNonconfigurableKeys = (new [])
    let __x9__ = targetKeys
    let __x10__ = 0i
    while (< __x10__ __x9__["length"]) {
      let key = __x9__[__x10__]
      app __x11__ = (target["GetOwnProperty"] target key)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let desc = __x11__
      if (&& (! (= desc undefined)) (= desc["Configurable"] false)) append key -> targetNonconfigurableKeys else append key -> targetConfigurableKeys
      __x10__ = (+ __x10__ 1i)
    }
    if (&& (= extensibleTarget true) (= targetNonconfigurableKeys["length"] 0i)) {
      app __x12__ = (WrapCompletion trapResult)
      return __x12__
    } else {}
    !!! "Etc"
    let __x13__ = targetNonconfigurableKeys
    let __x14__ = 0i
    while (< __x14__ __x13__["length"]) {
      let key = __x13__[__x14__]
      if (! (contains uncheckedResultKeys key)) {
        app __x15__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x15__
      } else {}
      !!! "Etc"
      __x14__ = (+ __x14__ 1i)
    }
    if (= extensibleTarget true) {
      app __x16__ = (WrapCompletion trapResult)
      return __x16__
    } else {}
    let __x17__ = targetConfigurableKeys
    let __x18__ = 0i
    while (< __x18__ __x17__["length"]) {
      let key = __x17__[__x18__]
      if (! (contains uncheckedResultKeys key)) {
        app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x19__
      } else {}
      !!! "Etc"
      __x18__ = (+ __x18__ 1i)
    }
    if (< 0i uncheckedResultKeys["length"]) {
      app __x20__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x20__
    } else {}
    app __x21__ = (WrapCompletion trapResult)
    return __x21__
  }"""), this)
}
