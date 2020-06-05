package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MultiplicativeExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "MultiplicativeExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MultiplicativeExpression1IsFunctionDefinition0" (this, MultiplicativeExpression, MultiplicativeOperator, ExponentiationExpression) => return false"""), this)
}
