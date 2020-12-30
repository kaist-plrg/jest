package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CoverCallExpressionAndAsyncArrowHead0BoundNames0 extends Algorithm {
  val name: String = "CoverCallExpressionAndAsyncArrowHead0BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CoverCallExpressionAndAsyncArrowHead0BoundNames0" (this, MemberExpression, Arguments) => {
    access __x0__ = (this "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "BoundNames")
    return __x1__
  }"""), this)
}
