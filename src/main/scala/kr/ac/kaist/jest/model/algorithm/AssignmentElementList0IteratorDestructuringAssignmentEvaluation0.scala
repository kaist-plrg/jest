package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentElementList0IteratorDestructuringAssignmentEvaluation0 extends Algorithm {
  val name: String = "AssignmentElementList0IteratorDestructuringAssignmentEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentElementList0IteratorDestructuringAssignmentEvaluation0" (this, AssignmentElisionElement, iteratorRecord) => {
    access __x0__ = (AssignmentElisionElement "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
