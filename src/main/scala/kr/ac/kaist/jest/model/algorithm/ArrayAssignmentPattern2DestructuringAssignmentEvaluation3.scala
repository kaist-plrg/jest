package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayAssignmentPattern2DestructuringAssignmentEvaluation3 extends Algorithm {
  val name: String = "ArrayAssignmentPattern2DestructuringAssignmentEvaluation3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayAssignmentPattern2DestructuringAssignmentEvaluation3" (this, AssignmentElementList, Elision, AssignmentRestElement, value) => {
    app __x0__ = (GetIterator value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    access __x1__ = (AssignmentElementList "IteratorDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ iteratorRecord)
    let status = __x2__
    app __x3__ = (IsAbruptCompletion status)
    if __x3__ {
      if (= iteratorRecord["Done"] false) {
        app __x4__ = (IteratorClose iteratorRecord status)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
      app __x6__ = (Completion status)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (! (= Elision absent)) {
      access __x8__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x9__ = (__x8__ iteratorRecord)
      status = __x9__
      app __x10__ = (IsAbruptCompletion status)
      if __x10__ {
        assert (= iteratorRecord["Done"] true)
        app __x11__ = (Completion status)
        app __x12__ = (WrapCompletion __x11__)
        return __x12__
      } else {}
    } else {}
    if (! (= AssignmentRestElement absent)) {
      access __x13__ = (AssignmentRestElement "IteratorDestructuringAssignmentEvaluation")
      app __x14__ = (__x13__ iteratorRecord)
      status = __x14__
    } else {}
    if (= iteratorRecord["Done"] false) {
      app __x15__ = (IteratorClose iteratorRecord status)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (WrapCompletion __x15__)
      return __x16__
    } else {}
    app __x17__ = (Completion status)
    app __x18__ = (WrapCompletion __x17__)
    return __x18__
  }"""), this)
}
