package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0 extends Algorithm {
  val name: String = "AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0" (this, AssignmentPropertyList, AssignmentProperty, value) => {
    access __x0__ = (AssignmentPropertyList "PropertyDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ value)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let propertyNames = __x1__
    access __x2__ = (AssignmentProperty "PropertyDestructuringAssignmentEvaluation")
    app __x3__ = (__x2__ value)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let nextNames = __x3__
    let __x4__ = nextNames
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let __x6__ = __x4__[__x5__]
      append __x6__ -> propertyNames
      __x5__ = (+ __x5__ 1i)
    }
    app __x7__ = (WrapCompletion propertyNames)
    return __x7__
  }"""), this)
}
