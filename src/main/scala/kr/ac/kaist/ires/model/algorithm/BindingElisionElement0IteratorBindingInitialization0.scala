package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElisionElement0IteratorBindingInitialization0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""BindingElisionElement0IteratorBindingInitialization0" (this, BindingElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElement "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
