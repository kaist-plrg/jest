package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IfAbruptRejectPromise {
  val length: Int = 2
  val func: Func = Func("""IfAbruptRejectPromise""", List(Id("""value"""), Id("""capability""")), None, ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""value""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""capability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""value""")), EStr("""Value"""))))))), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x0__""")))), ISeq(List())), IReturn(ERef(RefProp(RefId(Id("""capability""")), EStr("""Promise"""))))))), ISeq(List())), IExpr(ERef(RefId(Id("""value""")))))))
  /* Beautified form:
  "IfAbruptRejectPromise" (value, capability) => {
    if (= (typeof value) "Completion") if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x0__ = (Call capability["Reject"] undefined (new [value["Value"]]))
      if (&& (= (typeof __x0__) "Completion") (! (= __x0__["Type"] CONST_normal))) return __x0__ else {}
      return capability["Promise"]
    } else {}
    value
  }
  */
}
