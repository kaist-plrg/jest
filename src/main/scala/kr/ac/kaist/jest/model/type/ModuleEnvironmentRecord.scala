package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object ModuleEnvironmentRecord {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("WithBaseObject") -> DeclarativeEnvironmentRecordDOTWithBaseObject.func),
    (Str("HasSuperBinding") -> DeclarativeEnvironmentRecordDOTHasSuperBinding.func),
    (Str("DeleteBinding") -> ModuleEnvironmentRecordDOTDeleteBinding.func),
    (Str("InitializeBinding") -> DeclarativeEnvironmentRecordDOTInitializeBinding.func),
    (Str("GetBindingValue") -> ModuleEnvironmentRecordDOTGetBindingValue.func),
    (Str("CreateMutableBinding") -> DeclarativeEnvironmentRecordDOTCreateMutableBinding.func),
    (Str("GetThisBinding") -> ModuleEnvironmentRecordDOTGetThisBinding.func),
    (Str("CreateImportBinding") -> ModuleEnvironmentRecordDOTCreateImportBinding.func),
    (Str("CreateImmutableBinding") -> DeclarativeEnvironmentRecordDOTCreateImmutableBinding.func),
    (Str("SetMutableBinding") -> DeclarativeEnvironmentRecordDOTSetMutableBinding.func),
    (Str("HasThisBinding") -> ModuleEnvironmentRecordDOTHasThisBinding.func),
    (Str("HasBinding") -> DeclarativeEnvironmentRecordDOTHasBinding.func)
  ) ++ BaseType.getMap("ModuleEnvironmentRecord")
}
