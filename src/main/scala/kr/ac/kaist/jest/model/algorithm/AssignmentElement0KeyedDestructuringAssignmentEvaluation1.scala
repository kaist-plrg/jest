package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentElement0KeyedDestructuringAssignmentEvaluation1 extends Algorithm {
  val name: String = "AssignmentElement0KeyedDestructuringAssignmentEvaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentElement0KeyedDestructuringAssignmentEvaluation1" (this, DestructuringAssignmentTarget, Initializer, value, propertyName) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (is-completion lref) if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    app __x1__ = (GetV value propertyName)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let v = __x1__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x2__ = (IsAnonymousFunctionDefinition Initializer)
      access __x3__ = (DestructuringAssignmentTarget "IsIdentifierRef")
      if (&& (= __x2__ true) (= __x3__ true)) {
        app __x4__ = (GetReferencedName lref)
        access __x5__ = (Initializer "NamedEvaluation")
        app __x6__ = (__x5__ __x4__)
        let rhsValue = __x6__
      } else {
        access __x7__ = (Initializer "Evaluation")
        let defaultValue = __x7__
        app __x8__ = (GetValue defaultValue)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let rhsValue = __x8__
      }
    } else let rhsValue = v
    if (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral)) {
      let assignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern")
      access __x9__ = (assignmentPattern "DestructuringAssignmentEvaluation")
      app __x10__ = (__x9__ rhsValue)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (PutValue lref rhsValue)
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }"""), this)
}
