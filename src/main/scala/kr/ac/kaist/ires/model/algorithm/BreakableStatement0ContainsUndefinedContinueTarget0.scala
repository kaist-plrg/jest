package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakableStatement0ContainsUndefinedContinueTarget0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""BreakableStatement0ContainsUndefinedContinueTarget0" (this, IterationStatement, iterationSet, labelSet) => {
    let __x0__ = (copy-obj iterationSet)
    let __x1__ = labelSet
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> __x0__
      __x2__ = (+ __x2__ 1i)
    }
    let newIterationSet = __x0__
    access __x4__ = (IterationStatement "ContainsUndefinedContinueTarget")
    app __x5__ = (__x4__ newIterationSet (new []))
    return __x5__
  }""")
}
