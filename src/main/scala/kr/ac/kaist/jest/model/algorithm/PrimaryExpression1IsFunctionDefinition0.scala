package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "PrimaryExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression1IsFunctionDefinition0" (this, IdentifierReference) => return false"""), this)
}
