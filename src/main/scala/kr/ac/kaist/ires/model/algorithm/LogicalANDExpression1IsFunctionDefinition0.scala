package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalANDExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "LogicalANDExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LogicalANDExpression1IsFunctionDefinition0" (this, LogicalANDExpression, BitwiseORExpression) => return false"""), this)
}
