package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ProxyExoticObjectDOTDefineOwnProperty extends Algorithm {
  val name: String = "ProxyExoticObjectDOTDefineOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ProxyExoticObject.DefineOwnProperty" (O, P, Desc) => {
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
    app __x3__ = (GetMethod handler "defineProperty")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let trap = __x3__
    if (= trap undefined) {
      app __x4__ = (target["DefineOwnProperty"] target P Desc)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (FromPropertyDescriptor Desc)
    let descObj = __x6__
    app __x7__ = (Call trap handler (new [target, P, descObj]))
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (ToBoolean __x7__)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let booleanTrapResult = __x8__
    if (= booleanTrapResult false) {
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    app __x10__ = (target["GetOwnProperty"] target P)
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let targetDesc = __x10__
    app __x11__ = (IsExtensible target)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let extensibleTarget = __x11__
    if (&& (! (= Desc["Configurable"] absent)) (= Desc["Configurable"] false)) let settingConfigFalse = true else let settingConfigFalse = false
    if (= targetDesc undefined) {
      if (= extensibleTarget false) {
        app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x12__
      } else {}
      if (= settingConfigFalse true) {
        app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x13__
      } else {}
    } else {
      app __x14__ = (IsCompatiblePropertyDescriptor extensibleTarget Desc targetDesc)
      if (= __x14__ false) {
        app __x15__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x15__
      } else {}
      if (&& (= settingConfigFalse true) (= targetDesc["Configurable"] true)) {
        app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x16__
      } else {}
      !!! "If IsDataDescriptor ( id:{targetDesc} ) is value:{true} , id:{targetDesc} . [ [ Configurable ] ] is value:{false} , and id:{targetDesc} . [ [ Writable ] ] is value:{true} , then step-list:{...}"
    }
    app __x17__ = (WrapCompletion true)
    return __x17__
  }"""), this)
}
