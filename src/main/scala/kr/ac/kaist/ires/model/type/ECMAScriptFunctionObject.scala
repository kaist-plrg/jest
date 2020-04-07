package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ECMAScriptFunctionObject {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("Set") -> OrdinaryObjectDOTSet.func),
    (Str("SetPrototypeOf") -> OrdinaryObjectDOTSetPrototypeOf.func),
    (Str("Get") -> OrdinaryObjectDOTGet.func),
    (Str("PreventExtensions") -> OrdinaryObjectDOTPreventExtensions.func),
    (Str("Construct") -> ECMAScriptFunctionObjectDOTConstruct.func),
    (Str("Delete") -> OrdinaryObjectDOTDelete.func),
    (Str("GetOwnProperty") -> OrdinaryObjectDOTGetOwnProperty.func),
    (Str("Call") -> ECMAScriptFunctionObjectDOTCall.func),
    (Str("IsExtensible") -> OrdinaryObjectDOTIsExtensible.func),
    (Str("HasProperty") -> OrdinaryObjectDOTHasProperty.func),
    (Str("DefineOwnProperty") -> OrdinaryObjectDOTDefineOwnProperty.func),
    (Str("OwnPropertyKeys") -> OrdinaryObjectDOTOwnPropertyKeys.func),
    (Str("GetPrototypeOf") -> OrdinaryObjectDOTGetPrototypeOf.func)
  ) ++ BaseType.getMap("ECMAScriptFunctionObject")
}
