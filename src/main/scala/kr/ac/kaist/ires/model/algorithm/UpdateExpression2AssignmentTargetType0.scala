package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UpdateExpression2AssignmentTargetType0 extends Algorithm {
  val name: String = "UpdateExpression2AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UpdateExpression2AssignmentTargetType0" (this, LeftHandSideExpression) => return CONST_invalid"""), this)
}
