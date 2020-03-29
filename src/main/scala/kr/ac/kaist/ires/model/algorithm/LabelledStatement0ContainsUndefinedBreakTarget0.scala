package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = parseFunc(""""LabelledStatement0ContainsUndefinedBreakTarget0" (this, LabelIdentifier, LabelledItem, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    let __x1__ = (copy-obj labelSet)
    append label -> __x1__
    let newLabelSet = __x1__
    access __x2__ = (LabelledItem "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ newLabelSet)
    return __x3__
  }""")
}
