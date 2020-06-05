package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression4AssignmentTargetType0 extends Algorithm {
  val name: String = "MemberExpression4AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression4AssignmentTargetType0" (this, SuperProperty) => return CONST_simple"""), this)
}
