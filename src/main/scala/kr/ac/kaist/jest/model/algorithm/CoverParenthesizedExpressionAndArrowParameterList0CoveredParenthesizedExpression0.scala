package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CoverParenthesizedExpressionAndArrowParameterList0CoveredParenthesizedExpression0 extends Algorithm {
  val name: String = "CoverParenthesizedExpressionAndArrowParameterList0CoveredParenthesizedExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoverParenthesizedExpressionAndArrowParameterList0CoveredParenthesizedExpression0" (this, Expression) => return (parse-syntax this "ParenthesizedExpression")"""), this)
}
