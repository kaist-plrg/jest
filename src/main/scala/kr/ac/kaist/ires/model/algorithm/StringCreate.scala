package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringCreate {
  val length: Int = 2
  val func: Func = Func("""StringCreate""", List(Id("""value"""), Id("""prototype""")), None, ISeq(List(ILet(Id("""S"""), EMap(Ty("""StringExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""StringData"""), EUndef)))), IAssign(RefProp(RefId(Id("""S""")), EStr("""StringData""")), ERef(RefId(Id("""value""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""S""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""StringExoticObjectDOTGetOwnProperty""")))), IAssign(RefProp(RefId(Id("""S""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""StringExoticObjectDOTDefineOwnProperty""")))), IAssign(RefProp(RefId(Id("""S""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""StringExoticObjectDOTOwnPropertyKeys""")))), IAssign(RefProp(RefId(Id("""S""")), EStr("""Prototype""")), ERef(RefId(Id("""prototype""")))), IAssign(RefProp(RefId(Id("""S""")), EStr("""Extensible""")), EBool(true)), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""value""")), EStr("""length""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""S"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""length""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "StringCreate" (value, prototype) => {
    let S = (new StringExoticObject("SubMap" -> (new SubMap()), "StringData" -> undefined))
    S["StringData"] = value
    if (= S["HasProperty"] absent) S["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= S["DefineOwnProperty"] absent) S["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= S["Set"] absent) S["Set"] = OrdinaryObjectDOTSet else {}
    if (= S["SetPrototypeOf"] absent) S["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= S["Get"] absent) S["Get"] = OrdinaryObjectDOTGet else {}
    if (= S["PreventExtensions"] absent) S["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= S["Delete"] absent) S["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= S["GetOwnProperty"] absent) S["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= S["OwnPropertyKeys"] absent) S["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= S["GetPrototypeOf"] absent) S["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= S["IsExtensible"] absent) S["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    S["GetOwnProperty"] = StringExoticObjectDOTGetOwnProperty
    S["DefineOwnProperty"] = StringExoticObjectDOTDefineOwnProperty
    S["OwnPropertyKeys"] = StringExoticObjectDOTOwnPropertyKeys
    S["Prototype"] = prototype
    S["Extensible"] = true
    let length = value["length"]
    app __x0__ = (DefinePropertyOrThrow S "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (WrapCompletion S)
    return __x1__
  }
  */
}
