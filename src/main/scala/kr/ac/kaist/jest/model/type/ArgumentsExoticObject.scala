package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object ArgumentsExoticObject {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("Set") -> ArgumentsExoticObjectDOTSet.func),
    (Str("SetPrototypeOf") -> OrdinaryObjectDOTSetPrototypeOf.func),
    (Str("Get") -> ArgumentsExoticObjectDOTGet.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("Delete") -> ArgumentsExoticObjectDOTDelete.func),
    (Str("GetOwnProperty") -> ArgumentsExoticObjectDOTGetOwnProperty.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("HasProperty") -> OrdinaryObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> ArgumentsExoticObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> OrdinaryObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  ) ++ BaseType.getMap("ArgumentsExoticObject")
}
