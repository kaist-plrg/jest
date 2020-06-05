package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement6ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "Statement6ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement6ContainsDuplicateLabels0" (this, ContinueStatement, labelSet) => return false"""), this)
}
