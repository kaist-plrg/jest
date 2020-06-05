package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2ContainsUndefinedBreakTarget0 extends Algorithm {
  val name: String = "TryStatement2ContainsUndefinedBreakTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TryStatement2ContainsUndefinedBreakTarget0" (this, Block, Catch, Finally, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Catch "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    access __x4__ = (Finally "ContainsUndefinedBreakTarget")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }"""), this)
}
