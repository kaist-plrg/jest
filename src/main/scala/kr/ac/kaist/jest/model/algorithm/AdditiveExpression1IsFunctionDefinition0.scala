package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AdditiveExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "AdditiveExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AdditiveExpression1IsFunctionDefinition0" (this, AdditiveExpression, MultiplicativeExpression) => return false"""), this)
}
