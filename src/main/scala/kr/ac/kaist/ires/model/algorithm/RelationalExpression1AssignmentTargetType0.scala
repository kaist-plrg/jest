package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RelationalExpression1AssignmentTargetType0 extends Algorithm {
  val name: String = "RelationalExpression1AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""RelationalExpression1AssignmentTargetType0" (this, RelationalExpression, ShiftExpression) => return CONST_invalid"""), this)
}
