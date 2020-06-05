package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement8ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "Statement8ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement8ContainsDuplicateLabels0" (this, ReturnStatement, labelSet) => return false"""), this)
}
