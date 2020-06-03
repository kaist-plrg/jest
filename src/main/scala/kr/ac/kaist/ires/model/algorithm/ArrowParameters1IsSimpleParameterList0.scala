package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowParameters1IsSimpleParameterList0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArrowParameters1IsSimpleParameterList0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "IsSimpleParameterList")
    return __x1__
  }""")
}
