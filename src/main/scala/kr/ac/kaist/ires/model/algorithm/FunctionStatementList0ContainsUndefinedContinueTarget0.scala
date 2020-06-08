package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionStatementList0ContainsUndefinedContinueTarget0 extends Algorithm {
  val name: String = "FunctionStatementList0ContainsUndefinedContinueTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionStatementList0ContainsUndefinedContinueTarget0" (this, iterationSet, labelSet) => return false"""), this)
}
