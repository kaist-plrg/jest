package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
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
