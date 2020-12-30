package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentExpression5Evaluation0 extends Algorithm {
  val name: String = "AssignmentExpression5Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression5Evaluation0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression) => {
    access __x0__ = (LeftHandSideExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (AssignmentExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    let __x4__ = (get-syntax AssignmentOperator)
    __x4__ = (- __x4__ 1i)
    let op = __x4__
    if (= op "+") {
      app __x5__ = (ToPrimitive lval)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (ToPrimitive rval)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (Type __x5__)
      app __x8__ = (Type __x6__)
      if (|| (= __x7__ "String") (= __x8__ "String")) {
        app __x9__ = (ToString __x5__)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (ToString __x6__)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x11__ = (+ __x9__ __x10__)
      } else {
        app __x12__ = (ToNumber __x5__)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (ToNumber __x6__)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x11__ = (+ __x12__ __x13__)
      }
    } else if (= op "**") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (** __x14__ __x15__)
    } else if (= op "|") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x17__ = (ToInt32 rval)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      __x11__ = (| __x16__ __x17__)
    } else if (= op "^") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x17__ = (ToInt32 rval)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      __x11__ = (^ __x16__ __x17__)
    } else if (= op "&") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x17__ = (ToInt32 rval)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      __x11__ = (& __x16__ __x17__)
    } else if (= op ">>>") {
      app __x18__ = (ToUint32 lval)
      if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      app __x19__ = (ToUint32 rval)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      __x11__ = (>>> __x18__ __x19__)
    } else if (= op ">>") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x19__ = (ToUint32 rval)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      __x11__ = (>> __x16__ __x19__)
    } else if (= op "<<") {
      app __x16__ = (ToInt32 lval)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      app __x19__ = (ToUint32 rval)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      __x11__ = (<< __x16__ __x19__)
    } else if (= op "-") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (- __x14__ __x15__)
    } else if (= op "%") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (% __x14__ __x15__)
    } else if (= op "/") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (/ __x14__ __x15__)
    } else if (= op "*") {
      app __x14__ = (ToNumber lval)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (ToNumber rval)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x11__ = (* __x14__ __x15__)
    } else assert "invalid assign operator"
    let r = __x11__
    app __x20__ = (PutValue lref r)
    if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
    __x20__
    app __x21__ = (WrapCompletion r)
    return __x21__
  }"""), this)
}
