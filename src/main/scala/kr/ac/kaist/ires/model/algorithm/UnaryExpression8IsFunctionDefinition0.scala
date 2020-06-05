package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression8IsFunctionDefinition0 extends Algorithm {
  val name: String = "UnaryExpression8IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression8IsFunctionDefinition0" (this, AwaitExpression) => return false"""), this)
}
