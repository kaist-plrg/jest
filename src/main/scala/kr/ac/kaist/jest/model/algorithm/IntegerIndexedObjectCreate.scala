package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IntegerIndexedObjectCreate extends Algorithm {
  val name: String = "IntegerIndexedObjectCreate"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IntegerIndexedObjectCreate" (prototype) => {
    let internalSlotsList = (new ["Prototype", "Extensible", "ViewedArrayBuffer", "TypedArrayName", "ContentType", "ByteLength", "ByteOffset", "ArrayLength"])
    app __x0__ = (MakeBasicObject internalSlotsList)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let A = __x0__
    A["GetOwnProperty"] = IntegerIndexedExoticObjectDOTGetOwnProperty
    A["HasProperty"] = IntegerIndexedExoticObjectDOTHasProperty
    A["DefineOwnProperty"] = IntegerIndexedExoticObjectDOTDefineOwnProperty
    A["Get"] = IntegerIndexedExoticObjectDOTGet
    A["Set"] = IntegerIndexedExoticObjectDOTSet
    A["OwnPropertyKeys"] = IntegerIndexedExoticObjectDOTOwnPropertyKeys
    A["Prototype"] = prototype
    app __x1__ = (WrapCompletion A)
    return __x1__
  }"""), this)
}
