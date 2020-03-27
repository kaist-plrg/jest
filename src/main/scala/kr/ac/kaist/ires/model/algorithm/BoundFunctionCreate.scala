package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BoundFunctionCreate {
  val length: Int = 3
  val func: Func = Func("""BoundFunctionCreate""", List(Id("""targetFunction"""), Id("""boundThis"""), Id("""boundArgs""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""targetFunction"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""targetFunction""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""targetFunction"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""proto"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""obj"""), EMap(Ty("""BoundFunctionExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Call""")), ERef(RefId(Id("""BoundFunctionExoticObjectDOTCall""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""targetFunction"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Construct""")), ERef(RefId(Id("""BoundFunctionExoticObjectDOTConstruct""")))), ISeq(List())), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Prototype""")), ERef(RefId(Id("""proto""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Extensible""")), EBool(true)), IAssign(RefProp(RefId(Id("""obj""")), EStr("""BoundTargetFunction""")), ERef(RefId(Id("""targetFunction""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""BoundThis""")), ERef(RefId(Id("""boundThis""")))), IAssign(RefProp(RefId(Id("""obj""")), EStr("""BoundArguments""")), ERef(RefId(Id("""boundArgs""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "BoundFunctionCreate" (targetFunction, boundThis, boundArgs) => {
    app __x0__ = (Type targetFunction)
    assert (= __x0__ Object)
    app __x1__ = (targetFunction["GetPrototypeOf"] targetFunction)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let proto = __x1__
    let obj = (new BoundFunctionExoticObject("SubMap" -> (new SubMap())))
    if (= obj["HasProperty"] absent) obj["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= obj["DefineOwnProperty"] absent) obj["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= obj["Set"] absent) obj["Set"] = OrdinaryObjectDOTSet else {}
    if (= obj["SetPrototypeOf"] absent) obj["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= obj["Get"] absent) obj["Get"] = OrdinaryObjectDOTGet else {}
    if (= obj["PreventExtensions"] absent) obj["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= obj["Delete"] absent) obj["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= obj["GetOwnProperty"] absent) obj["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= obj["OwnPropertyKeys"] absent) obj["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= obj["GetPrototypeOf"] absent) obj["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= obj["IsExtensible"] absent) obj["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    obj["Call"] = BoundFunctionExoticObjectDOTCall
    app __x2__ = (IsConstructor targetFunction)
    if (= __x2__ true) obj["Construct"] = BoundFunctionExoticObjectDOTConstruct else {}
    obj["Prototype"] = proto
    obj["Extensible"] = true
    obj["BoundTargetFunction"] = targetFunction
    obj["BoundThis"] = boundThis
    obj["BoundArguments"] = boundArgs
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }
  */
}
