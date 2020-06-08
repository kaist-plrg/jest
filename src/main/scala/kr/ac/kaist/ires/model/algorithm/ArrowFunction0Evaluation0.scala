package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowFunction0Evaluation0 extends Algorithm {
  val name: String = "ArrowFunction0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrowFunction0Evaluation0" (this, ArrowParameters, ConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    access __x1__ = (ArrowParameters "CoveredFormalsList")
    let parameters = __x1__
    !!! "Let id:{closure} be OrdinaryFunctionCreate ( % Function . prototype % , id:{parameters} , nt:{ConciseBody} , const:{lexical-this} , id:{scope} ) ."
    closure["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }"""), this)
}
