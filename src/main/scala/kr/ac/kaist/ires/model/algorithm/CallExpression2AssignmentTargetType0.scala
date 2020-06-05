package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression2AssignmentTargetType0 extends Algorithm {
  val name: String = "CallExpression2AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression2AssignmentTargetType0" (this, CallExpression, Arguments) => return CONST_invalid"""), this)
}
