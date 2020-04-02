package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object IntegerIndexedExoticObject {
  val map: Map[Value, Value] = Map(
    (Str("Set") -> IntegerIndexedExoticObjectDOTSet.func),
    (Str("SetPrototypeOf") -> OrdinaryObjectDOTSetPrototypeOf.func),
    (Str("Get") -> IntegerIndexedExoticObjectDOTGet.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("Delete") -> OrdinaryObjectDOTDelete.func),
    (Str("GetOwnProperty") -> IntegerIndexedExoticObjectDOTGetOwnProperty.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("HasProperty") -> IntegerIndexedExoticObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> IntegerIndexedExoticObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> IntegerIndexedExoticObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  )
}