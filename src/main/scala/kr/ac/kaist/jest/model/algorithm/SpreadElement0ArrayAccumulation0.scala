package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SpreadElement0ArrayAccumulation0 extends Algorithm {
  val name: String = "SpreadElement0ArrayAccumulation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SpreadElement0ArrayAccumulation0" (this, AssignmentExpression, array, nextIndex) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let spreadRef = __x0__
    app __x1__ = (GetValue spreadRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let spreadObj = __x1__
    app __x2__ = (GetIterator spreadObj)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let iteratorRecord = __x2__
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let next = __x3__
      if (= next false) {
        app __x4__ = (WrapCompletion nextIndex)
        return __x4__
      } else {}
      app __x5__ = (IteratorValue next)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextValue = __x5__
      app __x6__ = (ToString nextIndex)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (CreateDataPropertyOrThrow array __x6__ nextValue)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      __x7__
      nextIndex = (+ nextIndex 1i)
    }
  }"""), this)
}
