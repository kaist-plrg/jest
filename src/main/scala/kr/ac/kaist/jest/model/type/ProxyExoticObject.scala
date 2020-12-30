package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object ProxyExoticObject {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("Set") -> ProxyExoticObjectDOTSet.func),
    (Str("SetPrototypeOf") -> ProxyExoticObjectDOTSetPrototypeOf.func),
    (Str("Get") -> ProxyExoticObjectDOTGet.func),
    (Str("PreventExtensions") -> ProxyExoticObjectDOTPreventExtensions.func),
    (Str("Construct") -> ProxyExoticObjectDOTConstruct.func),
    (Str("Delete") -> ProxyExoticObjectDOTDelete.func),
    (Str("GetOwnProperty") -> ProxyExoticObjectDOTGetOwnProperty.func),
    (Str("Call") -> ProxyExoticObjectDOTCall.func),
    (Str("IsExtensible") -> ProxyExoticObjectDOTIsExtensible.func),
    (Str("HasProperty") -> ProxyExoticObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> ProxyExoticObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> ProxyExoticObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> ProxyExoticObjectDOTGetPrototypeOf.func)
  ) ++ BaseType.getMap("ProxyExoticObject")
}
