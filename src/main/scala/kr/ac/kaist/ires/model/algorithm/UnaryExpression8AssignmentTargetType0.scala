package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression8AssignmentTargetType0 extends Algorithm {
  val name: String = "UnaryExpression8AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression8AssignmentTargetType0" (this, AwaitExpression) => return CONST_invalid"""), this)
}
