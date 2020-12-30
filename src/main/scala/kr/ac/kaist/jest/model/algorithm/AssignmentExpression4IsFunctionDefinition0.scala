package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentExpression4IsFunctionDefinition0 extends Algorithm {
  val name: String = "AssignmentExpression4IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression4IsFunctionDefinition0" (this, LeftHandSideExpression, AssignmentExpression) => return false"""), this)
}
