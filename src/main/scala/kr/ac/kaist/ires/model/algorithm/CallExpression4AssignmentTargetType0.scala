package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression4AssignmentTargetType0 extends Algorithm {
  val name: String = "CallExpression4AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression4AssignmentTargetType0" (this, CallExpression, Expression) => return CONST_simple"""), this)
}
