package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayAssignmentPattern0DestructuringAssignmentEvaluation3 extends Algorithm {
  val name: String = "ArrayAssignmentPattern0DestructuringAssignmentEvaluation3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayAssignmentPattern0DestructuringAssignmentEvaluation3" (this, Elision, AssignmentRestElement, value) => {
    app __x0__ = (GetIterator value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    if (! (= Elision absent)) {
      access __x1__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x2__ = (__x1__ iteratorRecord)
      let status = __x2__
      app __x3__ = (IsAbruptCompletion status)
      if __x3__ {
        assert (= iteratorRecord["Done"] true)
        app __x4__ = (Completion status)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    access __x6__ = (AssignmentRestElement "IteratorDestructuringAssignmentEvaluation")
    app __x7__ = (__x6__ iteratorRecord)
    let result = __x7__
    if (= iteratorRecord["Done"] false) {
      app __x8__ = (IteratorClose iteratorRecord result)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    app __x10__ = (WrapCompletion result)
    return __x10__
  }"""), this)
}
