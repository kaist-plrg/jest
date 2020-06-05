package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression3AssignmentTargetType0 extends Algorithm {
  val name: String = "MemberExpression3AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression3AssignmentTargetType0" (this, MemberExpression, TemplateLiteral) => return CONST_invalid"""), this)
}
