package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrowParameters1Contains0 extends Algorithm {
  val name: String = "ArrowParameters1Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrowParameters1Contains0" (this, CoverParenthesizedExpressionAndArrowParameterList, symbol) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "Contains")
    app __x2__ = (__x1__ symbol)
    return __x2__
  }"""), this)
}
