package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction1Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncArrowFunction1Evaluation0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody) => {
    if true let strict = true else let strict = false
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    access __x1__ = (CoverCallExpressionAndAsyncArrowHead "CoveredAsyncArrowHead")
    let head = __x1__
    access __x2__ = (head "ArrowFormalParameters")
    let parameters = __x2__
    app __x3__ = (AsyncFunctionCreate CONST_Arrow parameters AsyncConciseBody scope strict)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let closure = __x3__
    app __x4__ = (WrapCompletion closure)
    return __x4__
  }"""))
}
