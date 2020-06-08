package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LeftHandSideExpression2AssignmentTargetType0 extends Algorithm {
  val name: String = "LeftHandSideExpression2AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LeftHandSideExpression2AssignmentTargetType0" (this, OptionalExpression) => return CONST_invalid"""), this)
}
