package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression2AssignmentTargetType0 extends Algorithm {
  val name: String = "AssignmentExpression2AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression2AssignmentTargetType0" (this, ArrowFunction) => return CONST_invalid"""), this)
}
