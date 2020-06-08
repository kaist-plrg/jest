package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionStatementList0ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "FunctionStatementList0ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionStatementList0ContainsDuplicateLabels0" (this, labelSet) => return false"""), this)
}
