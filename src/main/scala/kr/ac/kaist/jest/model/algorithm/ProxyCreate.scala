package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ProxyCreate extends Algorithm {
  val name: String = "ProxyCreate"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ProxyCreate" (target, handler) => {
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
    app __x4__ = (MakeBasicObject (new ["ProxyHandler", "ProxyTarget"]))
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let P = __x4__
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
    app __x5__ = (IsCallable target)
    if (= __x5__ true) {
      P["Call"] = ProxyExoticObjectDOTCall
      app __x6__ = (IsConstructor target)
      if (= __x6__ true) P["Construct"] = ProxyExoticObjectDOTConstruct else {}
    } else {}
    P["ProxyTarget"] = target
    P["ProxyHandler"] = handler
    app __x7__ = (WrapCompletion P)
    return __x7__
  }"""), this)
}
