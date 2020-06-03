package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2ContainsDuplicateLabels0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""TryStatement2ContainsDuplicateLabels0" (this, Block, Catch, Finally, labelSet) => {
    access __x0__ = (Block "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (Catch "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    let hasDuplicates = __x3__
    if (= hasDuplicates true) return true else {}
    access __x4__ = (Finally "ContainsDuplicateLabels")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }""")
}
