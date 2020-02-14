package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayCreate {
  val length: Int = 1
  val func: Func = Func("""ArrayCreate""", List(Id("""length"""), Id("""proto""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""length"""))), ENum(-0.0)), IAssign(RefId(Id("""length""")), EINum(0L)), ISeq(List())), IIf(EBOp(OLt, EBOp(OSub, EINum(4294967296L), EINum(1L)), ERef(RefId(Id("""length""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""proto"""))), EAbsent), IAssign(RefId(Id("""proto""")), ERef(RefId(Id("""INTRINSIC_ArrayPrototype""")))), ISeq(List())), ILet(Id("""A"""), EMap(Ty("""ArrayExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""ArrayExoticObjectDOTDefineOwnProperty""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""Prototype""")), ERef(RefId(Id("""proto""")))), IAssign(RefProp(RefId(Id("""A""")), EStr("""Extensible""")), EBool(true)), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""length""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "ArrayCreate" (length, proto) => {
    if (= length -0.0) length = 0i else {}
    if (< (- 4294967296i 1i) length) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    if (= proto absent) proto = INTRINSIC_ArrayPrototype else {}
    let A = (new ArrayExoticObject("SubMap" -> (new SubMap())))
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
    A["DefineOwnProperty"] = ArrayExoticObjectDOTDefineOwnProperty
    A["Prototype"] = proto
    A["Extensible"] = true
    app __x1__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Value" -> length, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion A)
    return __x2__
  }
  */
}
