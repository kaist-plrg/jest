package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0 extends Algorithm {
  val name: String = "AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0" (this, AssignmentElement, iteratorRecord) => {
    access __x0__ = (AssignmentElement "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
