package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression4IsFunctionDefinition0 extends Algorithm {
  val name: String = "PrimaryExpression4IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression4IsFunctionDefinition0" (this, ObjectLiteral) => return false"""), this)
}
