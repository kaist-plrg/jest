package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ModuleEnvironmentRecord {
  val map: Map[Value, Value] = Map(
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
  )
}
