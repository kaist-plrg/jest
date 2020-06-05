package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression2IsFunctionDefinition0 extends Algorithm {
  val name: String = "PrimaryExpression2IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression2IsFunctionDefinition0" (this, Literal) => return false"""), this)
}
