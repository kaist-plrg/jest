package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ShiftExpression2IsFunctionDefinition0 extends Algorithm {
  val name: String = "ShiftExpression2IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ShiftExpression2IsFunctionDefinition0" (this, ShiftExpression, AdditiveExpression) => return false"""), this)
}
