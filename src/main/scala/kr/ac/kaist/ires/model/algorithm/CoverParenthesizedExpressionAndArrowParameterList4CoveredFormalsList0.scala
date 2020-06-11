package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CoverParenthesizedExpressionAndArrowParameterList4CoveredFormalsList0 extends Algorithm {
  val name: String = "CoverParenthesizedExpressionAndArrowParameterList4CoveredFormalsList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoverParenthesizedExpressionAndArrowParameterList4CoveredFormalsList0" (this, BindingPattern) => return (parse-syntax this "ArrowFormalParameters")"""), this)
}
