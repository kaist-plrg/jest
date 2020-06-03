package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CoverCallExpressionAndAsyncArrowHead0BoundNames0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""CoverCallExpressionAndAsyncArrowHead0BoundNames0" (this, MemberExpression, Arguments) => {
    access __x0__ = (this "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "BoundNames")
    return __x1__
  }""")
}
