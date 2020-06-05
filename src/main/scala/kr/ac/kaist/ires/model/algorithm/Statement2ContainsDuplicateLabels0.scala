package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement2ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "Statement2ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement2ContainsDuplicateLabels0" (this, EmptyStatement, labelSet) => return false"""), this)
}
