package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorExpression0IsFunctionDefinition1 extends Algorithm {
  val name: String = "AsyncGeneratorExpression0IsFunctionDefinition1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorExpression0IsFunctionDefinition1" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody) => return true"""), this)
}
