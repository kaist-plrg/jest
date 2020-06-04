package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyCreate extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""ProxyCreate" (target, handler) => {
    app __x0__ = (Type target)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    !!! "Etc"
    app __x2__ = (Type handler)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    !!! "Etc"
    let P = (new OrdinaryObject("SubMap" -> (new SubMap())))
    if (= P["HasProperty"] absent) P["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= P["DefineOwnProperty"] absent) P["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= P["Set"] absent) P["Set"] = OrdinaryObjectDOTSet else {}
    if (= P["SetPrototypeOf"] absent) P["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= P["Get"] absent) P["Get"] = OrdinaryObjectDOTGet else {}
    if (= P["PreventExtensions"] absent) P["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= P["Delete"] absent) P["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= P["GetOwnProperty"] absent) P["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= P["OwnPropertyKeys"] absent) P["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= P["GetPrototypeOf"] absent) P["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= P["IsExtensible"] absent) P["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    app __x4__ = (IsCallable target)
    if (= __x4__ true) {
      P["Call"] = ProxyExoticObjectDOTCall
      app __x5__ = (IsConstructor target)
      if (= __x5__ true) P["Construct"] = ProxyExoticObjectDOTConstruct else {}
    } else {}
    P["ProxyTarget"] = target
    P["ProxyHandler"] = handler
    app __x6__ = (WrapCompletion P)
    return __x6__
  }""")
}
