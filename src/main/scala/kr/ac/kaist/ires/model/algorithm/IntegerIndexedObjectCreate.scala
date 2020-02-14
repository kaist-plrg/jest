package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedObjectCreate {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedObjectCreate""", List(Id("""prototype"""), Id("""internalSlotsList""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTGetOwnProperty""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""HasProperty""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTHasProperty""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTDefineOwnProperty""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""Get""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTGet""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""Set""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTSet""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTOwnPropertyKeys""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""Prototype""")), ERef(RefId(Id("""prototype""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""Extensible""")), EBool(true)), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "IntegerIndexedObjectCreate" (prototype, internalSlotsList) => {
    !!! "Etc"
    if (= A["HasProperty"] absent) A["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= A["DefineOwnProperty"] absent) A["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= A["Set"] absent) A["Set"] = OrdinaryObjectDOTSet else {}
    if (= A["SetPrototypeOf"] absent) A["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= A["Get"] absent) A["Get"] = OrdinaryObjectDOTGet else {}
    if (= A["PreventExtensions"] absent) A["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= A["Delete"] absent) A["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= A["GetOwnProperty"] absent) A["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= A["OwnPropertyKeys"] absent) A["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= A["GetPrototypeOf"] absent) A["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= A["IsExtensible"] absent) A["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    A["GetOwnProperty"] = IntegerIndexedExoticObjectDOTGetOwnProperty
    A["HasProperty"] = IntegerIndexedExoticObjectDOTHasProperty
    A["DefineOwnProperty"] = IntegerIndexedExoticObjectDOTDefineOwnProperty
    A["Get"] = IntegerIndexedExoticObjectDOTGet
    A["Set"] = IntegerIndexedExoticObjectDOTSet
    A["OwnPropertyKeys"] = IntegerIndexedExoticObjectDOTOwnPropertyKeys
    A["Prototype"] = prototype
    A["Extensible"] = true
    app __x0__ = (WrapCompletion A)
    return __x0__
  }
  */
}
