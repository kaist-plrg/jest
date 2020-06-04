package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0" (this, AssignmentElement, iteratorRecord) => {
    access __x0__ = (AssignmentElement "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
