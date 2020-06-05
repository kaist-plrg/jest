package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement3ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "Statement3ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement3ContainsDuplicateLabels0" (this, ExpressionStatement, labelSet) => return false"""), this)
}
