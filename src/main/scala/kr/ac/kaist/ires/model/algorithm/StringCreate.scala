package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringCreate {
  val length: Int = 2
  val func: Func = parseFunc(""""StringCreate" (value, prototype) => {
    app __x0__ = (Type value)
    assert (= __x0__ String)
    let S = (new StringExoticObject("SubMap" -> (new SubMap())))
    S["StringData"] = value
    if (= S["HasProperty"] absent) S["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= S["DefineOwnProperty"] absent) S["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= S["Set"] absent) S["Set"] = OrdinaryObjectDOTSet else {}
    if (= S["SetPrototypeOf"] absent) S["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= S["Get"] absent) S["Get"] = OrdinaryObjectDOTGet else {}
    if (= S["PreventExtensions"] absent) S["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= S["Delete"] absent) S["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= S["GetOwnProperty"] absent) S["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= S["OwnPropertyKeys"] absent) S["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= S["GetPrototypeOf"] absent) S["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= S["IsExtensible"] absent) S["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    S["GetOwnProperty"] = StringExoticObjectDOTGetOwnProperty
    S["DefineOwnProperty"] = StringExoticObjectDOTDefineOwnProperty
    S["OwnPropertyKeys"] = StringExoticObjectDOTOwnPropertyKeys
    S["Prototype"] = prototype
    S["Extensible"] = true
    let length = value["length"]
    app __x1__ = (DefinePropertyOrThrow S "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion S)
    return __x2__
  }""")
}
