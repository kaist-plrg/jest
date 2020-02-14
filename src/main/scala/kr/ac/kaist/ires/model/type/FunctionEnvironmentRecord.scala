package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object FunctionEnvironmentRecord {
  val map: Map[Value, Value] = Map(
    (Str("WithBaseObject") -> DeclarativeEnvironmentRecordDOTWithBaseObject.func),
    (Str("HasSuperBinding") -> FunctionEnvironmentRecordDOTHasSuperBinding.func),
    (Str("DeleteBinding") -> DeclarativeEnvironmentRecordDOTDeleteBinding.func),
    (Str("InitializeBinding") -> DeclarativeEnvironmentRecordDOTInitializeBinding.func),
    (Str("GetBindingValue") -> DeclarativeEnvironmentRecordDOTGetBindingValue.func),
    (Str("CreateMutableBinding") -> DeclarativeEnvironmentRecordDOTCreateMutableBinding.func),
    (Str("BindThisValue") -> FunctionEnvironmentRecordDOTBindThisValue.func),
    (Str("GetThisBinding") -> FunctionEnvironmentRecordDOTGetThisBinding.func),
    (Str("GetSuperBase") -> FunctionEnvironmentRecordDOTGetSuperBase.func),
    (Str("CreateImmutableBinding") -> DeclarativeEnvironmentRecordDOTCreateImmutableBinding.func),
    (Str("SetMutableBinding") -> DeclarativeEnvironmentRecordDOTSetMutableBinding.func),
    (Str("HasThisBinding") -> FunctionEnvironmentRecordDOTHasThisBinding.func),
    (Str("HasBinding") -> DeclarativeEnvironmentRecordDOTHasBinding.func)
  )
}
