package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayBindingPattern0IteratorBindingInitialization2 extends Algorithm {
  val name: String = "ArrayBindingPattern0IteratorBindingInitialization2"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern0IteratorBindingInitialization2" (this, Elision, iteratorRecord, environment) => {
    access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
