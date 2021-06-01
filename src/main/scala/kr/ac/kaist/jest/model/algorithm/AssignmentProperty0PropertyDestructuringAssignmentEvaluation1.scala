package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentProperty0PropertyDestructuringAssignmentEvaluation1 extends Algorithm {
  val name: String = "AssignmentProperty0PropertyDestructuringAssignmentEvaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentProperty0PropertyDestructuringAssignmentEvaluation1" (this, IdentifierReference, Initializer, value) => {
    access __x0__ = (IdentifierReference "StringValue")
    let P = __x0__
    app __x1__ = (ResolveBinding P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lref = __x1__
    app __x2__ = (GetV value P)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let v = __x2__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x3__ = (IsAnonymousFunctionDefinition Initializer)
      if (= __x3__ true) {
        access __x4__ = (Initializer "NamedEvaluation")
        app __x5__ = (__x4__ P)
        v = __x5__
      } else {
        access __x6__ = (Initializer "Evaluation")
        let defaultValue = __x6__
        app __x7__ = (GetValue defaultValue)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        v = __x7__
      }
    } else {}
    app __x8__ = (PutValue lref v)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    __x8__
    app __x9__ = (WrapCompletion (new [P]))
    return __x9__
  }"""), this)
}
