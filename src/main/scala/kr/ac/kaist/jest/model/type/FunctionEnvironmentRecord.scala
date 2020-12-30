package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object FunctionEnvironmentRecord {
  val map: Map[Value, Value] = Map[Value, Value](
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
  ) ++ BaseType.getMap("FunctionEnvironmentRecord")
}
