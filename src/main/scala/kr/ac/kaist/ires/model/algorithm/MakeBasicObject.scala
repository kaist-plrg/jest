package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeBasicObject {
  val length: Int = 1
  val func: Func = parseFunc(""""MakeBasicObject" (internalSlotsList) => {
    let obj = (new OrdinaryObject("SubMap" -> (new SubMap())))
    let __x0__ = internalSlotsList
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let __x2__ = __x0__[__x1__]
      obj[__x2__] = undefined
      __x1__ = (+ __x1__ 1i)
    }
    if (= obj["HasProperty"] absent) obj["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= obj["DefineOwnProperty"] absent) obj["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= obj["Set"] absent) obj["Set"] = OrdinaryObjectDOTSet else {}
    if (= obj["SetPrototypeOf"] absent) obj["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= obj["Get"] absent) obj["Get"] = OrdinaryObjectDOTGet else {}
    if (= obj["PreventExtensions"] absent) obj["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= obj["Delete"] absent) obj["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= obj["GetOwnProperty"] absent) obj["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= obj["OwnPropertyKeys"] absent) obj["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= obj["GetPrototypeOf"] absent) obj["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= obj["IsExtensible"] absent) obj["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    if (contains internalSlotsList "Extensible") obj["Extensible"] = true else {}
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }""")
}
