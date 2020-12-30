package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentRestProperty0RestDestructuringAssignmentEvaluation0 extends Algorithm {
  val name: String = "AssignmentRestProperty0RestDestructuringAssignmentEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentRestProperty0RestDestructuringAssignmentEvaluation0" (this, DestructuringAssignmentTarget, value, excludedNames) => {
    access __x0__ = (DestructuringAssignmentTarget "Evaluation")
    let lref = __x0__
    if (is-completion lref) if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
    lref
    app restObj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    app __x1__ = (CopyDataProperties restObj value excludedNames)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (PutValue lref restObj)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
