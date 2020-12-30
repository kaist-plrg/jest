package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionRestParameter0IteratorBindingInitialization0 extends Algorithm {
  val name: String = "FunctionRestParameter0IteratorBindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionRestParameter0IteratorBindingInitialization0" (this, BindingRestElement, iteratorRecord, environment) => {
    access __x0__ = (BindingRestElement "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
