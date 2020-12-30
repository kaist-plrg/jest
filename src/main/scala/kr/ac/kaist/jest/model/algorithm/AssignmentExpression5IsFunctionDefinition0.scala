package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentExpression5IsFunctionDefinition0 extends Algorithm {
  val name: String = "AssignmentExpression5IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression5IsFunctionDefinition0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression) => return false"""), this)
}
