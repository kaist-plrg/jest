package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem0LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem0LabelledEvaluation0""", List(Id("""this"""), Id("""Statement"""), Id("""labelSet""")), None, IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """LabelledStatement"""), EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """BreakableStatement""")), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledEvaluation""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__"""))))))))
  /* Beautified form:
  "LabelledItem0LabelledEvaluation0" (this, Statement, labelSet) => if (|| (is-instance-of Statement LabelledStatement) (is-instance-of Statement BreakableStatement)) {
    access __x0__ = (Statement "LabelledEvaluation")
    app __x1__ = (__x0__ labelSet)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  } else {
    access __x3__ = (Statement "Evaluation")
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
