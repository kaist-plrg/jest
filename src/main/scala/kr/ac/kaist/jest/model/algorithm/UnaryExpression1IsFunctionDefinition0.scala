package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UnaryExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "UnaryExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression1IsFunctionDefinition0" (this, UnaryExpression) => return false"""), this)
}
