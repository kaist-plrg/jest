package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BitwiseORExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "BitwiseORExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BitwiseORExpression1IsFunctionDefinition0" (this, BitwiseORExpression, BitwiseXORExpression) => return false"""), this)
}
