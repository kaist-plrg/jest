package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IfStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = parseFunc(""""IfStatement1ContainsUndefinedBreakTarget0" (this, Expression, Statement0, Statement1, labelSet) => {
    access __x0__ = (Statement0 "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Statement1 "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }""")
}