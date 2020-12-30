package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CoalesceExpression0IsFunctionDefinition0 extends Algorithm {
  val name: String = "CoalesceExpression0IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoalesceExpression0IsFunctionDefinition0" (this, CoalesceExpressionHead, BitwiseORExpression) => return false"""), this)
}
