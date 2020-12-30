package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LabelledItem0LabelledEvaluation0 extends Algorithm {
  val name: String = "LabelledItem0LabelledEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledItem0LabelledEvaluation0" (this, Statement, labelSet) => if (|| (is-instance-of Statement LabelledStatement) (is-instance-of Statement BreakableStatement)) {
    access __x0__ = (Statement "LabelledEvaluation")
    app __x1__ = (__x0__ labelSet)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  } else {
    access __x3__ = (Statement "Evaluation")
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
