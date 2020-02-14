package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakableStatement0LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement0LabelledEvaluation0""", List(Id("""this"""), Id("""IterationStatement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IterationStatement"""))), EStr("""LabelledEvaluation""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_break""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Target"""))), ERef(RefId(Id("""CONST_empty""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x2__""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))))), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x3__"""))))))), ISeq(List())), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""stmtResult"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "BreakableStatement0LabelledEvaluation0" (this, IterationStatement, labelSet) => {
    access __x0__ = (IterationStatement "LabelledEvaluation")
    app __x1__ = (__x0__ labelSet)
    let stmtResult = __x1__
    if (= stmtResult["Type"] CONST_break) if (= stmtResult["Target"] CONST_empty) if (= stmtResult["Value"] CONST_empty) {
      app __x2__ = (NormalCompletion undefined)
      stmtResult = __x2__
    } else {
      app __x3__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x3__
    } else {} else {}
    app __x4__ = (Completion stmtResult)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
