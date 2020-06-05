package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalORExpression1AssignmentTargetType0 extends Algorithm {
  val name: String = "LogicalORExpression1AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LogicalORExpression1AssignmentTargetType0" (this, LogicalORExpression, LogicalANDExpression) => return CONST_invalid"""), this)
}
