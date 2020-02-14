package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ImmutablePrototypeExoticObject {
  val map: Map[Value, Value] = Map(
    (Str("Set") -> OrdinaryObjectDOTSet.func),
    (Str("SetPrototypeOf") -> ImmutablePrototypeExoticObjectDOTSetPrototypeOf.func),
    (Str("Get") -> OrdinaryObjectDOTGet.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("Delete") -> OrdinaryObjectDOTDelete.func),
    (Str("GetOwnProperty") -> OrdinaryObjectDOTGetOwnProperty.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("HasProperty") -> OrdinaryObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> OrdinaryObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> OrdinaryObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  )
}
