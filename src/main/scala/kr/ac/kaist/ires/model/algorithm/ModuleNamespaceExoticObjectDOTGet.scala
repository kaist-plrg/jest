package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTGet {
  val length: Int = 2
  val func: Func = Func("""ModuleNamespaceExoticObject.Get""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ILet(Id("""exports"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Exports""")))), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""exports"""))), ERef(RefId(Id("""P"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Module""")))), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""m""")), EStr("""ResolveExport"""))), List(ERef(RefId(Id("""m"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""binding"""), ERef(RefId(Id("""__x5__""")))), IAssert(EBOp(OEq, ETypeOf(ERef(RefId(Id("""binding""")))), EStr("""ResolvedBindingRecord"""))), ILet(Id("""targetModule"""), ERef(RefProp(RefId(Id("""binding""")), EStr("""Module""")))), IAssert(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""targetModule"""))), EUndef))), ILet(Id("""targetEnv"""), ERef(RefProp(RefId(Id("""targetModule""")), EStr("""Environment""")))), IIf(EBOp(OEq, ERef(RefId(Id("""targetEnv"""))), EUndef), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""targetEnvRec"""), ERef(RefProp(RefId(Id("""targetEnv""")), EStr("""EnvironmentRecord""")))), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""targetEnvRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""targetEnvRec"""))), ERef(RefProp(RefId(Id("""binding""")), EStr("""BindingName"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "ModuleNamespaceExoticObject.Get" (O, P, Receiver) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ Symbol) {
      app __x2__ = (OrdinaryGet O P Receiver)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let exports = O["Exports"]
    if (! (contains exports P)) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    let m = O["Module"]
    app __x5__ = (m["ResolveExport"] m P)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let binding = __x5__
    assert (= (typeof binding) "ResolvedBindingRecord")
    let targetModule = binding["Module"]
    assert (! (= targetModule undefined))
    let targetEnv = targetModule["Environment"]
    if (= targetEnv undefined) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    let targetEnvRec = targetEnv["EnvironmentRecord"]
    app __x7__ = (targetEnvRec["GetBindingValue"] targetEnvRec binding["BindingName"] true)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
