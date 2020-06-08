package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression6AssignmentTargetType0 extends Algorithm {
  val name: String = "CallExpression6AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression6AssignmentTargetType0" (this, CallExpression, TemplateLiteral) => return CONST_invalid"""), this)
}
