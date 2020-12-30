package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CoverParenthesizedExpressionAndArrowParameterList0CoveredFormalsList0 extends Algorithm {
  val name: String = "CoverParenthesizedExpressionAndArrowParameterList0CoveredFormalsList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoverParenthesizedExpressionAndArrowParameterList0CoveredFormalsList0" (this, Expression) => return (parse-syntax this "ArrowFormalParameters")"""), this)
}
