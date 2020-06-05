package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "StatementListItem1ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem1ContainsDuplicateLabels0" (this, Declaration, labelSet) => return false"""), this)
}
