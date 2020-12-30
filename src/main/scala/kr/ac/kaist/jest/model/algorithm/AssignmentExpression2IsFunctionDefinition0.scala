package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentExpression2IsFunctionDefinition0 extends Algorithm {
  val name: String = "AssignmentExpression2IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression2IsFunctionDefinition0" (this, ArrowFunction) => return true"""), this)
}
