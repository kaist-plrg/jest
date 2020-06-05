package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CoverParenthesizedExpressionAndArrowParameterList5CoveredFormalsList0 extends Algorithm {
  val name: String = "CoverParenthesizedExpressionAndArrowParameterList5CoveredFormalsList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoverParenthesizedExpressionAndArrowParameterList5CoveredFormalsList0" (this, Expression, BindingIdentifier) => return (parse-syntax this "ArrowFormalParameters" )"""), this)
}
