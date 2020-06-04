package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElementList0IteratorDestructuringAssignmentEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AssignmentElementList0IteratorDestructuringAssignmentEvaluation0" (this, AssignmentElisionElement, iteratorRecord) => {
    access __x0__ = (AssignmentElisionElement "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
