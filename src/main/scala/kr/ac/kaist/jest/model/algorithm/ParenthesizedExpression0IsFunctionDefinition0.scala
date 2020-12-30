package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ParenthesizedExpression0IsFunctionDefinition0 extends Algorithm {
  val name: String = "ParenthesizedExpression0IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ParenthesizedExpression0IsFunctionDefinition0" (this, Expression) => {
    access __x0__ = (Expression "IsFunctionDefinition")
    return __x0__
  }"""), this)
}
