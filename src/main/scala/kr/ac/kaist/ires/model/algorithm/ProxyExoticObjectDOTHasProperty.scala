package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = parseFunc(""""ProxyExoticObject.HasProperty" (O, P) => {
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
    app __x3__ = (GetMethod handler "has")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let trap = __x3__
    if (= trap undefined) {
      app __x4__ = (target["HasProperty"] target P)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Call trap handler (new [target, P]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (ToBoolean __x6__)
    let booleanTrapResult = __x7__
    if (= booleanTrapResult false) {
      app __x8__ = (target["GetOwnProperty"] target P)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let targetDesc = __x8__
      if (! (= targetDesc undefined)) {
        if (= targetDesc["Configurable"] false) {
          app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x9__
        } else {}
        app __x10__ = (IsExtensible target)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let extensibleTarget = __x10__
        if (= extensibleTarget false) {
          app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x11__
        } else {}
      } else {}
    } else {}
    app __x12__ = (WrapCompletion booleanTrapResult)
    return __x12__
  }""")
}
