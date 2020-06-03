package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern0IteratorBindingInitialization2 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArrayBindingPattern0IteratorBindingInitialization2" (this, Elision, iteratorRecord, environment) => {
    access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
