package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedObjectCreate {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""IntegerIndexedObjectCreate" (prototype, internalSlotsList) => {
    let A = (new OrdinaryObject("SubMap" -> (new SubMap())))
    let __x0__ = internalSlotsList
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let __x2__ = __x0__[__x1__]
      A[__x2__] = undefined
      __x1__ = (+ __x1__ 1i)
    }
    if (= A["HasProperty"] absent) A["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= A["DefineOwnProperty"] absent) A["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= A["Set"] absent) A["Set"] = OrdinaryObjectDOTSet else {}
    if (= A["SetPrototypeOf"] absent) A["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= A["Get"] absent) A["Get"] = OrdinaryObjectDOTGet else {}
    if (= A["PreventExtensions"] absent) A["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= A["Delete"] absent) A["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= A["GetOwnProperty"] absent) A["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= A["OwnPropertyKeys"] absent) A["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= A["GetPrototypeOf"] absent) A["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= A["IsExtensible"] absent) A["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    A["GetOwnProperty"] = IntegerIndexedExoticObjectDOTGetOwnProperty
    A["HasProperty"] = IntegerIndexedExoticObjectDOTHasProperty
    A["DefineOwnProperty"] = IntegerIndexedExoticObjectDOTDefineOwnProperty
    A["Get"] = IntegerIndexedExoticObjectDOTGet
    A["Set"] = IntegerIndexedExoticObjectDOTSet
    A["OwnPropertyKeys"] = IntegerIndexedExoticObjectDOTOwnPropertyKeys
    A["Prototype"] = prototype
    A["Extensible"] = true
    app __x3__ = (WrapCompletion A)
    return __x3__
  }""")
}
