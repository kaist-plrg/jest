package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElementList0IteratorBindingInitialization0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""BindingElementList0IteratorBindingInitialization0" (this, BindingElisionElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElisionElement "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
