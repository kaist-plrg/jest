package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression7IsFunctionDefinition0 extends Algorithm {
  val name: String = "UnaryExpression7IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression7IsFunctionDefinition0" (this, UnaryExpression) => return false"""), this)
}
