package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentProperty1PropertyDestructuringAssignmentEvaluation0 extends Algorithm {
  val name: String = "AssignmentProperty1PropertyDestructuringAssignmentEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentProperty1PropertyDestructuringAssignmentEvaluation0" (this, PropertyName, AssignmentElement, value) => {
    access __x0__ = (PropertyName "Evaluation")
    let name = __x0__
    if (is-completion name) if (= name["Type"] CONST_normal) name = name["Value"] else return name else {}
    name
    access __x1__ = (AssignmentElement "KeyedDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value name)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion (new [name]))
    return __x3__
  }"""), this)
}
