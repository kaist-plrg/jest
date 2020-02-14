package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ModuleNamespaceExoticObject {
  val map: Map[Value, Value] = Map(
    (Str("Set") -> ModuleNamespaceExoticObjectDOTSet.func),
    (Str("SetPrototypeOf") -> ModuleNamespaceExoticObjectDOTSetPrototypeOf.func),
    (Str("Get") -> ModuleNamespaceExoticObjectDOTGet.func),
    (Str("PreventExtensions") -> ModuleNamespaceExoticObjectDOTPreventExtensions.func),
    (Str("Delete") -> ModuleNamespaceExoticObjectDOTDelete.func),
    (Str("GetOwnProperty") -> ModuleNamespaceExoticObjectDOTGetOwnProperty.func),
    (Str("IsExtensible") -> ModuleNamespaceExoticObjectDOTIsExtensible.func),
    (Str("HasProperty") -> ModuleNamespaceExoticObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> ModuleNamespaceExoticObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> ModuleNamespaceExoticObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  )
}
