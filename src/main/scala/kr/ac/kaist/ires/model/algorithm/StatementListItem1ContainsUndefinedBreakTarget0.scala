package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1ContainsUndefinedBreakTarget0 extends Algorithm {
  val name: String = "StatementListItem1ContainsUndefinedBreakTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem1ContainsUndefinedBreakTarget0" (this, Declaration, labelSet) => return false"""), this)
}
