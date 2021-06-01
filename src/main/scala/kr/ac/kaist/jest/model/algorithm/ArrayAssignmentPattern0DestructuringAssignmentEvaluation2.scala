package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayAssignmentPattern0DestructuringAssignmentEvaluation2 extends Algorithm {
  val name: String = "ArrayAssignmentPattern0DestructuringAssignmentEvaluation2"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayAssignmentPattern0DestructuringAssignmentEvaluation2" (this, Elision, value) => {
    app __x0__ = (GetIterator value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    access __x1__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ iteratorRecord)
    let result = __x2__
    if (= iteratorRecord["Done"] false) {
      app __x3__ = (IteratorClose iteratorRecord result)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion result)
    return __x5__
  }"""), this)
}
