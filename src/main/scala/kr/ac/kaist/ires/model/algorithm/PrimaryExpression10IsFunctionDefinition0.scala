package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression10IsFunctionDefinition0 extends Algorithm {
  val name: String = "PrimaryExpression10IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression10IsFunctionDefinition0" (this, RegularExpressionLiteral) => return false"""), this)
}
