package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1ContainsUndefinedContinueTarget0 extends Algorithm {
  val name: String = "StatementListItem1ContainsUndefinedContinueTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem1ContainsUndefinedContinueTarget0" (this, Declaration, iterationSet, labelSet) => return false"""), this)
}
