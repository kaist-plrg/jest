package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction1Evaluation0 extends Algorithm {
  val name: String = "AsyncArrowFunction1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncArrowFunction1Evaluation0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    access __x1__ = (CoverCallExpressionAndAsyncArrowHead "CoveredAsyncArrowHead")
    let head = __x1__
    access __x2__ = (head "ArrowFormalParameters")
    let parameters = __x2__
    !!! "Let id:{closure} be ! OrdinaryFunctionCreate ( % AsyncFunction . prototype % , id:{parameters} , nt:{AsyncConciseBody} , const:{lexical-this} , id:{scope} ) ."
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion closure)
    return __x3__
  }"""), this)
}
