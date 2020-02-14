package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyCreate {
  val length: Int = 2
  val func: Func = Func("""ProxyCreate""", List(Id("""target"""), Id("""handler""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handler"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), ILet(Id("""P"""), EMap(Ty("""ProxyExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""ProxyTarget"""), EUndef), (EStr("""ProxyHandler"""), EUndef)))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IAssign(RefProp(RefId(Id("""P""")), EStr("""Call""")), ERef(RefId(Id("""ProxyExoticObjectDOTCall""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), IAssign(RefProp(RefId(Id("""P""")), EStr("""Construct""")), ERef(RefId(Id("""ProxyExoticObjectDOTConstruct""")))), ISeq(List())))), ISeq(List())), IAssign(RefProp(RefId(Id("""P""")), EStr("""ProxyTarget""")), ERef(RefId(Id("""target""")))), IAssign(RefProp(RefId(Id("""P""")), EStr("""ProxyHandler""")), ERef(RefId(Id("""handler""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""P"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "ProxyCreate" (target, handler) => {
    app __x0__ = (Type target)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    !!! "Etc"
    app __x2__ = (Type handler)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    !!! "Etc"
    let P = (new ProxyExoticObject("SubMap" -> (new SubMap()), "ProxyTarget" -> undefined, "ProxyHandler" -> undefined))
    if (= P["HasProperty"] absent) P["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= P["DefineOwnProperty"] absent) P["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= P["Set"] absent) P["Set"] = OrdinaryObjectDOTSet else {}
    if (= P["SetPrototypeOf"] absent) P["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= P["Get"] absent) P["Get"] = OrdinaryObjectDOTGet else {}
    if (= P["PreventExtensions"] absent) P["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= P["Delete"] absent) P["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= P["GetOwnProperty"] absent) P["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= P["OwnPropertyKeys"] absent) P["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= P["GetPrototypeOf"] absent) P["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= P["IsExtensible"] absent) P["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    app __x4__ = (IsCallable target)
    if (= __x4__ true) {
      P["Call"] = ProxyExoticObjectDOTCall
      app __x5__ = (IsConstructor target)
      if (= __x5__ true) P["Construct"] = ProxyExoticObjectDOTConstruct else {}
    } else {}
    P["ProxyTarget"] = target
    P["ProxyHandler"] = handler
    app __x6__ = (WrapCompletion P)
    return __x6__
  }
  */
}
