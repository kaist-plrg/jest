package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionAllocate {
  val length: Int = 3
  val func: Func = parseFunc(""""FunctionAllocate" (functionPrototype, strict, functionKind) => {
    app __x0__ = (Type functionPrototype)
    assert (= __x0__ Object)
    assert (|| (|| (|| (|| (= functionKind "normal") (= functionKind "non-constructor")) (= functionKind "generator")) (= functionKind "async")) (= functionKind "async generator"))
    if (= functionKind "normal") let needsConstruct = true else let needsConstruct = false
    if (= functionKind "non-constructor") functionKind = "normal" else {}
    let F = (new ECMAScriptFunctionObject("SubMap" -> (new SubMap())))
    delete F["Call"]
    delete F["Construct"]
    if (= F["HasProperty"] absent) F["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= F["DefineOwnProperty"] absent) F["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= F["Set"] absent) F["Set"] = OrdinaryObjectDOTSet else {}
    if (= F["SetPrototypeOf"] absent) F["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= F["Get"] absent) F["Get"] = OrdinaryObjectDOTGet else {}
    if (= F["PreventExtensions"] absent) F["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= F["Delete"] absent) F["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= F["GetOwnProperty"] absent) F["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= F["OwnPropertyKeys"] absent) F["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= F["GetPrototypeOf"] absent) F["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= F["IsExtensible"] absent) F["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    F["Call"] = ECMAScriptFunctionObjectDOTCall
    if (= needsConstruct true) {
      F["Construct"] = ECMAScriptFunctionObjectDOTConstruct
      F["ConstructorKind"] = "base"
    } else {}
    F["Strict"] = strict
    F["FunctionKind"] = functionKind
    F["Prototype"] = functionPrototype
    F["Extensible"] = true
    F["Realm"] = REALM
    app __x1__ = (WrapCompletion F)
    return __x1__
  }""")
}
