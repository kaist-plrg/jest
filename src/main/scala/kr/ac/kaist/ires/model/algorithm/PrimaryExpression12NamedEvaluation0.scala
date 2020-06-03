package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression12NamedEvaluation0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""PrimaryExpression12NamedEvaluation0" (this, CoverParenthesizedExpressionAndArrowParameterList, name) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "NamedEvaluation")
    app __x2__ = (__x1__ name)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
