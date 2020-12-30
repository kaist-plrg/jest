package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionExpression0Contains1 extends Algorithm {
  val name: String = "FunctionExpression0Contains1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionExpression0Contains1" (this, BindingIdentifier, FormalParameters, FunctionBody, symbol) => return false"""), this)
}
