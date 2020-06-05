package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression1AssignmentTargetType0 extends Algorithm {
  val name: String = "AssignmentExpression1AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression1AssignmentTargetType0" (this, YieldExpression) => return CONST_invalid"""), this)
}
