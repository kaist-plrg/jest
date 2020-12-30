package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionExpression0HasName1 extends Algorithm {
  val name: String = "FunctionExpression0HasName1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionExpression0HasName1" (this, BindingIdentifier, FormalParameters, FunctionBody) => return true"""), this)
}
