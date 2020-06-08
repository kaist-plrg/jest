package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceCreate extends Algorithm {
  val name: String = "ModuleNamespaceCreate"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceCreate" (module, exports) => {
    assert (= module["Namespace"] undefined)
    !!! "Let id:{internalSlotsList} be the internal slots listed in Table 29 ."
    app __x0__ = (MakeBasicObject internalSlotsList)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let M = __x0__
    if (= M["HasProperty"] absent) M["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= M["DefineOwnProperty"] absent) M["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= M["Set"] absent) M["Set"] = OrdinaryObjectDOTSet else {}
    if (= M["SetPrototypeOf"] absent) M["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= M["Get"] absent) M["Get"] = OrdinaryObjectDOTGet else {}
    if (= M["PreventExtensions"] absent) M["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= M["Delete"] absent) M["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= M["GetOwnProperty"] absent) M["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= M["OwnPropertyKeys"] absent) M["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= M["GetPrototypeOf"] absent) M["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= M["IsExtensible"] absent) M["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    M["Prototype"] = null
    M["Module"] = module
    !!! "Etc"
    M["Exports"] = sortedExports
    !!! "Etc"
    module["Namespace"] = M
    app __x1__ = (WrapCompletion M)
    return __x1__
  }"""), this)
}
