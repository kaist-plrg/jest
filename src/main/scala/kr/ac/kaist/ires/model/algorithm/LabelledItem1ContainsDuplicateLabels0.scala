package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem1ContainsDuplicateLabels0 extends Algorithm {
  val name: String = "LabelledItem1ContainsDuplicateLabels0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledItem1ContainsDuplicateLabels0" (this, FunctionDeclaration, labelSet) => return false"""), this)
}
