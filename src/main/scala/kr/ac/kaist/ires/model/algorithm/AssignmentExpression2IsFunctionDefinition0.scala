package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression2IsFunctionDefinition0 extends Algorithm {
  val name: String = "AssignmentExpression2IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression2IsFunctionDefinition0" (this, ArrowFunction) => return true"""), this)
}
