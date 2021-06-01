package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentElement0IteratorDestructuringAssignmentEvaluation1 extends Algorithm {
  val name: String = "AssignmentElement0IteratorDestructuringAssignmentEvaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentElement0IteratorDestructuringAssignmentEvaluation1" (this, DestructuringAssignmentTarget, Initializer, iteratorRecord) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (is-completion lref) if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    if (= iteratorRecord["Done"] false) {
      app __x1__ = (IteratorStep iteratorRecord)
      let next = __x1__
      app __x2__ = (IsAbruptCompletion next)
      if __x2__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x3__ = (IteratorValue next)
        let value = __x3__
        app __x4__ = (IsAbruptCompletion value)
        if __x4__ iteratorRecord["Done"] = true else {}
        if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else return value else {}
        value
      }
    } else {}
    if (= iteratorRecord["Done"] true) let value = undefined else {}
    if (&& (! (= Initializer absent)) (= value undefined)) {
      app __x5__ = (IsAnonymousFunctionDefinition Initializer)
      access __x6__ = (DestructuringAssignmentTarget "IsIdentifierRef")
      if (&& (= __x5__ true) (= __x6__ true)) {
        app __x7__ = (GetReferencedName lref)
        access __x8__ = (Initializer "NamedEvaluation")
        app __x9__ = (__x8__ __x7__)
        let v = __x9__
      } else {
        access __x10__ = (Initializer "Evaluation")
        let defaultValue = __x10__
        app __x11__ = (GetValue defaultValue)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let v = __x11__
      }
    } else let v = value
    if (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral)) {
      let nestedAssignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern")
      access __x12__ = (nestedAssignmentPattern "DestructuringAssignmentEvaluation")
      app __x13__ = (__x12__ v)
      app __x14__ = (WrapCompletion __x13__)
      return __x14__
    } else {}
    app __x15__ = (PutValue lref v)
    if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }"""), this)
}
