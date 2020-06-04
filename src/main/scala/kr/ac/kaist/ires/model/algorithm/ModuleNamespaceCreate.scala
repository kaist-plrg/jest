package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceCreate extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""ModuleNamespaceCreate" (module, exports) => {
    assert (= module["Namespace"] undefined)
    let M = (new OrdinaryObject("SubMap" -> (new SubMap())))
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
    M["Module"] = module
    !!! "Etc"
    M["Exports"] = sortedExports
    !!! "Etc"
    module["Namespace"] = M
    app __x0__ = (WrapCompletion M)
    return __x0__
  }""")
}
