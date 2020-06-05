package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression5AssignmentTargetType0 extends Algorithm {
  val name: String = "UnaryExpression5AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression5AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid"""), this)
}
