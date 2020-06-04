package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1ContainsDuplicateLabels0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""TryStatement1ContainsDuplicateLabels0" (this, Block, Finally, labelSet) => {
    access __x0__ = (Block "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (Finally "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }""")
}
