package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
object ObjectEnvironmentRecord {
  val map: Map[Value, Value] = Map(
    (Str("WithBaseObject") -> ObjectEnvironmentRecordDOTWithBaseObject.func),
    (Str("HasSuperBinding") -> ObjectEnvironmentRecordDOTHasSuperBinding.func),
    (Str("DeleteBinding") -> ObjectEnvironmentRecordDOTDeleteBinding.func),
    (Str("InitializeBinding") -> ObjectEnvironmentRecordDOTInitializeBinding.func),
    (Str("GetBindingValue") -> ObjectEnvironmentRecordDOTGetBindingValue.func),
    (Str("CreateMutableBinding") -> ObjectEnvironmentRecordDOTCreateMutableBinding.func),
    (Str("SetMutableBinding") -> ObjectEnvironmentRecordDOTSetMutableBinding.func),
    (Str("HasThisBinding") -> ObjectEnvironmentRecordDOTHasThisBinding.func),
    (Str("HasBinding") -> ObjectEnvironmentRecordDOTHasBinding.func)
  )
}
