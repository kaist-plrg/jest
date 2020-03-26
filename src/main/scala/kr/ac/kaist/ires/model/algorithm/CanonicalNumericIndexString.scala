package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CanonicalNumericIndexString {
  val length: Int = 1
  val func: Func = Func("""CanonicalNumericIndexString""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""argument"""))), EStr("""-0""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(-0.0))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""n"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""argument"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""n"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "CanonicalNumericIndexString" (argument) => {
    app __x0__ = (Type argument)
    assert (= __x0__ String)
    if (= argument "-0") {
      app __x1__ = (WrapCompletion -0.0)
      return __x1__
    } else {}
    app __x2__ = (ToNumber argument)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let n = __x2__
    app __x3__ = (ToString n)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (SameValue __x3__ argument)
    if (= __x4__ false) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion n)
    return __x6__
  }
  */
}
