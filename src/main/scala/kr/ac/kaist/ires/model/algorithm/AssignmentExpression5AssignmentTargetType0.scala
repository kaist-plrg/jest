package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression5AssignmentTargetType0 extends Algorithm {
  val name: String = "AssignmentExpression5AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression5AssignmentTargetType0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression) => return CONST_invalid"""), this)
}
