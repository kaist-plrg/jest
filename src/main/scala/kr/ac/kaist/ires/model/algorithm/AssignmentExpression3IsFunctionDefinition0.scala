package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression3IsFunctionDefinition0 extends Algorithm {
  val name: String = "AssignmentExpression3IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression3IsFunctionDefinition0" (this, AsyncArrowFunction) => return true"""), this)
}
