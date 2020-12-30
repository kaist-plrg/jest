package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CoverCallExpressionAndAsyncArrowHead0CoveredAsyncArrowHead0 extends Algorithm {
  val name: String = "CoverCallExpressionAndAsyncArrowHead0CoveredAsyncArrowHead0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoverCallExpressionAndAsyncArrowHead0CoveredAsyncArrowHead0" (this, MemberExpression, Arguments) => return (parse-syntax this "AsyncArrowHead")"""), this)
}
