package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakableStatement1LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement1LabelledEvaluation0""", List(Id("""this"""), Id("""SwitchStatement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""SwitchStatement"""))), EStr("""Evaluation""")), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_break""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Target"""))), ERef(RefId(Id("""CONST_empty""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x1__""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))))), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x2__"""))))))), ISeq(List())), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""stmtResult"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "BreakableStatement1LabelledEvaluation0" (this, SwitchStatement, labelSet) => {
    access __x0__ = (SwitchStatement "Evaluation")
    let stmtResult = __x0__
    if (= stmtResult["Type"] CONST_break) if (= stmtResult["Target"] CONST_empty) if (= stmtResult["Value"] CONST_empty) {
      app __x1__ = (NormalCompletion undefined)
      stmtResult = __x1__
    } else {
      app __x2__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x2__
    } else {} else {}
    app __x3__ = (Completion stmtResult)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
