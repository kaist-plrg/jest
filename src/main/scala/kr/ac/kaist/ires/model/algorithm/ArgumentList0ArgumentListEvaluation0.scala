package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentList0ArgumentListEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArgumentList0ArgumentListEvaluation0" (this, AssignmentExpression) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let ref = __x0__
    app __x1__ = (GetValue ref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let arg = __x1__
    app __x2__ = (WrapCompletion (new [arg]))
    return __x2__
  }""")
}
