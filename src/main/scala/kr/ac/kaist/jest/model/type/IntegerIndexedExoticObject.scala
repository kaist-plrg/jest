package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object IntegerIndexedExoticObject {
  val map: Map[Value, Value] = Map[Value, Value](
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
  ) ++ BaseType.getMap("IntegerIndexedExoticObject")
}
