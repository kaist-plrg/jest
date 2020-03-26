package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeSuperPropertyReference {
  val length: Int = 3
  val func: Func = Func("""MakeSuperPropertyReference""", List(Id("""actualThis"""), Id("""propertyKey"""), Id("""strict""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()), ILet(Id("""env"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""HasSuperBinding"""))), List(ERef(RefId(Id("""env"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""GetSuperBase"""))), List(ERef(RefId(Id("""env"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""baseValue"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""baseValue"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""bv"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""bv""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""propertyKey""")))), (EStr("""thisValue"""), ERef(RefId(Id("""actualThis""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "MakeSuperPropertyReference" (actualThis, propertyKey, strict) => {
    app __x0__ = (GetThisEnvironment )
    let env = __x0__
    app __x1__ = (env["HasSuperBinding"] env)
    assert (= __x1__ true)
    app __x2__ = (env["GetSuperBase"] env)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let baseValue = __x2__
    app __x3__ = (RequireObjectCoercible baseValue)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let bv = __x3__
    app __x4__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyKey, "thisValue" -> actualThis, "StrictReference" -> strict)))
    return __x4__
  }
  */
}
