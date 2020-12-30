package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CallExpression5HasCallInTailPosition0 extends Algorithm {
  val name: String = "CallExpression5HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression5HasCallInTailPosition0" (this, CallExpression, IdentifierName, call) => return false"""), this)
}
