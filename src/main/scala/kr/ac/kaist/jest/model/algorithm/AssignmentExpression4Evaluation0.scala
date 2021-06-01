package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentExpression4Evaluation0 extends Algorithm {
  val name: String = "AssignmentExpression4Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression4Evaluation0" (this, LeftHandSideExpression, AssignmentExpression) => {
    if (! (|| (is-instance-of LeftHandSideExpression ObjectLiteral) (is-instance-of LeftHandSideExpression ArrayLiteral))) {
      access __x0__ = (LeftHandSideExpression "Evaluation")
      let lref = __x0__
      if (is-completion lref) if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
      app __x1__ = (IsAnonymousFunctionDefinition AssignmentExpression)
      access __x2__ = (LeftHandSideExpression "IsIdentifierRef")
      if (&& (= __x1__ true) (= __x2__ true)) {
        app __x3__ = (GetReferencedName lref)
        access __x4__ = (AssignmentExpression "NamedEvaluation")
        app __x5__ = (__x4__ __x3__)
        let rval = __x5__
      } else {
        access __x6__ = (AssignmentExpression "Evaluation")
        let rref = __x6__
        app __x7__ = (GetValue rref)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let rval = __x7__
      }
      app __x8__ = (PutValue lref rval)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__
      app __x9__ = (WrapCompletion rval)
      return __x9__
    } else {}
    let assignmentPattern = (parse-syntax LeftHandSideExpression "AssignmentPattern")
    access __x10__ = (AssignmentExpression "Evaluation")
    let rref = __x10__
    app __x11__ = (GetValue rref)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let rval = __x11__
    access __x12__ = (assignmentPattern "DestructuringAssignmentEvaluation")
    app __x13__ = (__x12__ rval)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    __x13__
    app __x14__ = (WrapCompletion rval)
    return __x14__
  }"""), this)
}
