package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0AssignmentTargetType0 extends Algorithm {
  val name: String = "ParenthesizedExpression0AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ParenthesizedExpression0AssignmentTargetType0" (this, Expression) => {
    access __x0__ = (Expression "AssignmentTargetType")
    return __x0__
  }"""), this)
}
