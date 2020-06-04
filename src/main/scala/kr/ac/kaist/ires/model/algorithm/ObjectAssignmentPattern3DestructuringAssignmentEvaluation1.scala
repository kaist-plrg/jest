package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectAssignmentPattern3DestructuringAssignmentEvaluation1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ObjectAssignmentPattern3DestructuringAssignmentEvaluation1" (this, AssignmentPropertyList, AssignmentRestProperty, value) => {
    app __x0__ = (RequireObjectCoercible value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (AssignmentPropertyList "PropertyDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let excludedNames = __x2__
    access __x3__ = (AssignmentRestProperty "RestDestructuringAssignmentEvaluation")
    app __x4__ = (__x3__ value excludedNames)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }""")
}
