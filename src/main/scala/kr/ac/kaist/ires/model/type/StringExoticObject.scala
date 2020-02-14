package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object StringExoticObject {
  val map: Map[Value, Value] = Map(
    (Str("Set") -> OrdinaryObjectDOTSet.func),
    (Str("SetPrototypeOf") -> OrdinaryObjectDOTSetPrototypeOf.func),
    (Str("Get") -> OrdinaryObjectDOTGet.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("Delete") -> OrdinaryObjectDOTDelete.func),
    (Str("GetOwnProperty") -> StringExoticObjectDOTGetOwnProperty.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("HasProperty") -> OrdinaryObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> StringExoticObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> StringExoticObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  )
}
