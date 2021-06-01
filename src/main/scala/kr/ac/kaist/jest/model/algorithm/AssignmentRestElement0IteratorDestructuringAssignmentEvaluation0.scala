package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentRestElement0IteratorDestructuringAssignmentEvaluation0 extends Algorithm {
  val name: String = "AssignmentRestElement0IteratorDestructuringAssignmentEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentRestElement0IteratorDestructuringAssignmentEvaluation0" (this, DestructuringAssignmentTarget, iteratorRecord) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (is-completion lref) if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    app __x1__ = (ArrayCreate 0i)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let A = __x1__
    let n = 0i
    while (= iteratorRecord["Done"] false) {
      app __x2__ = (IteratorStep iteratorRecord)
      let next = __x2__
      app __x3__ = (IsAbruptCompletion next)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x4__ = (IteratorValue next)
        let nextValue = __x4__
        app __x5__ = (IsAbruptCompletion nextValue)
        if __x5__ iteratorRecord["Done"] = true else {}
        if (is-completion nextValue) if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
        nextValue
        app __x6__ = (ToString n)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        app __x7__ = (CreateDataPropertyOrThrow A __x6__ nextValue)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        __x7__
        n = (+ n 1i)
      }
    }
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      app __x8__ = (PutValue lref A)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    let nestedAssignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern")
    access __x10__ = (nestedAssignmentPattern "DestructuringAssignmentEvaluation")
    app __x11__ = (__x10__ A)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }"""), this)
}
