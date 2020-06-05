package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement13ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "Statement13ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement13ContainsDuplicateLabels0" (this, DebuggerStatement, labelSet) => return false"""), this)
}
