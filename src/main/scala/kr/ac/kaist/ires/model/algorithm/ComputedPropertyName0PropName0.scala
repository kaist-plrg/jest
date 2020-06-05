package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ComputedPropertyName0PropName0 extends Algorithm {
  val name: String = "ComputedPropertyName0PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ComputedPropertyName0PropName0" (this, AssignmentExpression) => return CONST_empty"""), this)
}
