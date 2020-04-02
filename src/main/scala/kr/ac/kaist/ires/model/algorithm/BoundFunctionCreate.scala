package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BoundFunctionCreate {
  val length: Int = 3
  val func: Func = parseFunc(""""BoundFunctionCreate" (targetFunction, boundThis, boundArgs) => {
    app __x0__ = (Type targetFunction)
    assert (= __x0__ Object)
    app __x1__ = (targetFunction["GetPrototypeOf"] targetFunction)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let proto = __x1__
    let obj = (new OrdinaryObject("SubMap" -> (new SubMap())))
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
    obj["Call"] = BoundFunctionExoticObjectDOTCall
    app __x2__ = (IsConstructor targetFunction)
    if (= __x2__ true) obj["Construct"] = BoundFunctionExoticObjectDOTConstruct else {}
    obj["Prototype"] = proto
    obj["Extensible"] = true
    obj["BoundTargetFunction"] = targetFunction
    obj["BoundThis"] = boundThis
    obj["BoundArguments"] = boundArgs
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }""")
}
