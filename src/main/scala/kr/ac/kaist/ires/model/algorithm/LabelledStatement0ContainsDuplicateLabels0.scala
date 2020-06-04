package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0ContainsDuplicateLabels0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""LabelledStatement0ContainsDuplicateLabels0" (this, LabelIdentifier, LabelledItem, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    if (contains labelSet label) return true else {}
    let __x1__ = (copy-obj labelSet)
    append label -> __x1__
    let newLabelSet = __x1__
    access __x2__ = (LabelledItem "ContainsDuplicateLabels")
    app __x3__ = (__x2__ newLabelSet)
    return __x3__
  }""")
}
