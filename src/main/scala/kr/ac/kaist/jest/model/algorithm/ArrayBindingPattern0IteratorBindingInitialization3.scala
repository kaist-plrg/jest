package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayBindingPattern0IteratorBindingInitialization3 extends Algorithm {
  val name: String = "ArrayBindingPattern0IteratorBindingInitialization3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern0IteratorBindingInitialization3" (this, Elision, BindingRestElement, iteratorRecord, environment) => {
    if (! (= Elision absent)) {
      access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x1__ = (__x0__ iteratorRecord)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    access __x2__ = (BindingRestElement "IteratorBindingInitialization")
    app __x3__ = (__x2__ iteratorRecord environment)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
