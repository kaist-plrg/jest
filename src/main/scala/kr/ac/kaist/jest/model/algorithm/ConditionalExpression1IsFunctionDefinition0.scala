package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ConditionalExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "ConditionalExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ConditionalExpression1IsFunctionDefinition0" (this, ShortCircuitExpression, AssignmentExpression0, AssignmentExpression1) => return false"""), this)
}
