package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ExponentiationExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "ExponentiationExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ExponentiationExpression1IsFunctionDefinition0" (this, UpdateExpression, ExponentiationExpression) => return false"""), this)
}
