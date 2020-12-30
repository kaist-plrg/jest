package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrowParameters1ExpectedArgumentCount0 extends Algorithm {
  val name: String = "ArrowParameters1ExpectedArgumentCount0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrowParameters1ExpectedArgumentCount0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "ExpectedArgumentCount")
    return __x1__
  }"""), this)
}
