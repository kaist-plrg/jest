package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Construct {
  val length: Int = 1
  val func: Func = Func("""Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""newTarget"""))), EAbsent), IAssign(RefId(Id("""newTarget""")), ERef(RefId(Id("""F""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""argumentsList"""))), EAbsent), IAssign(RefId(Id("""argumentsList""")), EList(List())), ISeq(List())), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""F"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""newTarget"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Construct"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""newTarget"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "Construct" (F, argumentsList, newTarget) => {
    if (= newTarget absent) newTarget = F else {}
    if (= argumentsList absent) argumentsList = (new []) else {}
    app __x0__ = (IsConstructor F)
    assert (= __x0__ true)
    app __x1__ = (IsConstructor newTarget)
    assert (= __x1__ true)
    app __x2__ = (F["Construct"] F argumentsList newTarget)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
