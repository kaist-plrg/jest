package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CoverCallExpressionAndAsyncArrowHead0CoveredCallExpression0 extends Algorithm {
  val name: String = "CoverCallExpressionAndAsyncArrowHead0CoveredCallExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoverCallExpressionAndAsyncArrowHead0CoveredCallExpression0" (this, MemberExpression, Arguments) => return (parse-syntax this "CallMemberExpression")"""), this)
}
