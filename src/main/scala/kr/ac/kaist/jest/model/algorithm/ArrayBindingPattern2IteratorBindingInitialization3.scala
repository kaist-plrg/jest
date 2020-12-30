package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayBindingPattern2IteratorBindingInitialization3 extends Algorithm {
  val name: String = "ArrayBindingPattern2IteratorBindingInitialization3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern2IteratorBindingInitialization3" (this, BindingElementList, Elision, BindingRestElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElementList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    if (! (= Elision absent)) {
      access __x2__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x3__ = (__x2__ iteratorRecord)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    access __x4__ = (BindingRestElement "IteratorBindingInitialization")
    app __x5__ = (__x4__ iteratorRecord environment)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
