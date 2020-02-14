package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Construct {
  val length: Int = 1
  val func: Func = Func("""Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""newTarget"""))), EAbsent), IAssign(RefId(Id("""newTarget""")), ERef(RefId(Id("""F""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""argumentsList"""))), EAbsent), IAssign(RefId(Id("""argumentsList""")), EList(List())), ISeq(List())), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Construct"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""newTarget"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "Construct" (F, argumentsList, newTarget) => {
    if (= newTarget absent) newTarget = F else {}
    if (= argumentsList absent) argumentsList = (new []) else {}
    app __x0__ = (F["Construct"] F argumentsList newTarget)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
