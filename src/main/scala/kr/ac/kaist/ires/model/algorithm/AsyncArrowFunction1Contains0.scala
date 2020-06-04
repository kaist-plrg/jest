package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction1Contains0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncArrowFunction1Contains0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (CoverCallExpressionAndAsyncArrowHead "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "Contains")
    app __x2__ = (__x1__ symbol)
    if (= __x2__ true) return true else {}
    access __x3__ = (AsyncConciseBody "Contains")
    app __x4__ = (__x3__ symbol)
    return __x4__
  }""")
}
