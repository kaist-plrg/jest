package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem1LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1LabelledEvaluation0""", List(Id("""this"""), Id("""FunctionDeclaration"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclaration"""))), EStr("""Evaluation""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "LabelledItem1LabelledEvaluation0" (this, FunctionDeclaration, labelSet) => {
    access __x0__ = (FunctionDeclaration "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
