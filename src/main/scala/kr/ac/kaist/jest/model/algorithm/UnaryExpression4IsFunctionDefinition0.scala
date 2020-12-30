package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UnaryExpression4IsFunctionDefinition0 extends Algorithm {
  val name: String = "UnaryExpression4IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression4IsFunctionDefinition0" (this, UnaryExpression) => return false"""), this)
}
