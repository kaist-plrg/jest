package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberToString {
  val length: Int = 1
  val func: Func = Func("""NumberToString""", List(Id("""m""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""m"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""0"""))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OLt, ERef(RefId(Id("""m"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NumberToString"""))), List(EUOp(ONeg, ERef(RefId(Id("""m""")))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EStr("""-"""), ERef(RefId(Id("""__x2__""")))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""Infinity"""))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IReturn(EConvert(ERef(RefId(Id("""m"""))), CNumToStr, List())), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")))))
  /* Beautified form:
  "NumberToString" (m) => {
    if (= m NaN) {
      app __x0__ = (WrapCompletion "NaN")
      return __x0__
    } else {}
    if (|| (= m 0i) (= m -0.0)) {
      app __x1__ = (WrapCompletion "0")
      return __x1__
    } else {}
    if (< m 0i) {
      app __x2__ = (NumberToString (- m))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion (+ "-" __x2__))
      return __x3__
    } else {}
    if (= m Infinity) {
      app __x4__ = (WrapCompletion "Infinity")
      return __x4__
    } else {}
    return (convert m num2str )
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
  }
  */
}
