package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object DeclarativeEnvironmentRecord {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("WithBaseObject") -> DeclarativeEnvironmentRecordDOTWithBaseObject.func),
    (Str("HasSuperBinding") -> DeclarativeEnvironmentRecordDOTHasSuperBinding.func),
    (Str("DeleteBinding") -> DeclarativeEnvironmentRecordDOTDeleteBinding.func),
    (Str("InitializeBinding") -> DeclarativeEnvironmentRecordDOTInitializeBinding.func),
    (Str("GetBindingValue") -> DeclarativeEnvironmentRecordDOTGetBindingValue.func),
    (Str("CreateMutableBinding") -> DeclarativeEnvironmentRecordDOTCreateMutableBinding.func),
    (Str("CreateImmutableBinding") -> DeclarativeEnvironmentRecordDOTCreateImmutableBinding.func),
    (Str("SetMutableBinding") -> DeclarativeEnvironmentRecordDOTSetMutableBinding.func),
    (Str("HasThisBinding") -> DeclarativeEnvironmentRecordDOTHasThisBinding.func),
    (Str("HasBinding") -> DeclarativeEnvironmentRecordDOTHasBinding.func)
  ) ++ BaseType.getMap("DeclarativeEnvironmentRecord")
}
