package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition4PropName0 extends Algorithm {
  val name: String = "PropertyDefinition4PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinition4PropName0" (this, AssignmentExpression) => return CONST_empty"""), this)
}
