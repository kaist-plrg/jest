package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2ContainsUndefinedContinueTarget0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""TryStatement2ContainsUndefinedContinueTarget0" (this, Block, Catch, Finally, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Catch "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    access __x4__ = (Finally "ContainsUndefinedContinueTarget")
    app __x5__ = (__x4__ iterationSet (new []))
    return __x5__
  }""")
}
