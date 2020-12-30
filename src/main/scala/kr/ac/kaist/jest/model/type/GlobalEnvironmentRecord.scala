package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
object GlobalEnvironmentRecord {
  val map: Map[Value, Value] = Map[Value, Value](
    (Str("CreateGlobalVarBinding") -> GlobalEnvironmentRecordDOTCreateGlobalVarBinding.func),
    (Str("WithBaseObject") -> GlobalEnvironmentRecordDOTWithBaseObject.func),
    (Str("HasRestrictedGlobalProperty") -> GlobalEnvironmentRecordDOTHasRestrictedGlobalProperty.func),
    (Str("HasSuperBinding") -> GlobalEnvironmentRecordDOTHasSuperBinding.func),
    (Str("HasLexicalDeclaration") -> GlobalEnvironmentRecordDOTHasLexicalDeclaration.func),
    (Str("CanDeclareGlobalVar") -> GlobalEnvironmentRecordDOTCanDeclareGlobalVar.func),
    (Str("DeleteBinding") -> GlobalEnvironmentRecordDOTDeleteBinding.func),
    (Str("InitializeBinding") -> GlobalEnvironmentRecordDOTInitializeBinding.func),
    (Str("GetBindingValue") -> GlobalEnvironmentRecordDOTGetBindingValue.func),
    (Str("GetThisBinding") -> GlobalEnvironmentRecordDOTGetThisBinding.func),
    (Str("CanDeclareGlobalFunction") -> GlobalEnvironmentRecordDOTCanDeclareGlobalFunction.func),
    (Str("HasVarDeclaration") -> GlobalEnvironmentRecordDOTHasVarDeclaration.func),
    (Str("CreateImmutableBinding") -> GlobalEnvironmentRecordDOTCreateImmutableBinding.func),
    (Str("CreateGlobalFunctionBinding") -> GlobalEnvironmentRecordDOTCreateGlobalFunctionBinding.func),
    (Str("CreateMutableBinding") -> GlobalEnvironmentRecordDOTCreateMutableBinding.func),
    (Str("SetMutableBinding") -> GlobalEnvironmentRecordDOTSetMutableBinding.func),
    (Str("HasThisBinding") -> GlobalEnvironmentRecordDOTHasThisBinding.func),
    (Str("HasBinding") -> GlobalEnvironmentRecordDOTHasBinding.func)
  ) ++ BaseType.getMap("GlobalEnvironmentRecord")
}
