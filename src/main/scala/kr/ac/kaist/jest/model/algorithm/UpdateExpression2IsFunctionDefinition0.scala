package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UpdateExpression2IsFunctionDefinition0 extends Algorithm {
  val name: String = "UpdateExpression2IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UpdateExpression2IsFunctionDefinition0" (this, LeftHandSideExpression) => return false"""), this)
}
