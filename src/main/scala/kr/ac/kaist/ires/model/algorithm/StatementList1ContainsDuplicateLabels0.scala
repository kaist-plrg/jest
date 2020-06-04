package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1ContainsDuplicateLabels0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""StatementList1ContainsDuplicateLabels0" (this, StatementList, StatementListItem, labelSet) => {
    access __x0__ = (StatementList "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (StatementListItem "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }""")
}
