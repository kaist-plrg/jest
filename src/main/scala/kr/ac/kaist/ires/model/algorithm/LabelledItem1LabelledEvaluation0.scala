package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem1LabelledEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""LabelledItem1LabelledEvaluation0" (this, FunctionDeclaration, labelSet) => {
    access __x0__ = (FunctionDeclaration "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
