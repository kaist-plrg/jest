package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryCallEvaluateBody extends Algorithm {
  val name: String = "OrdinaryCallEvaluateBody"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryCallEvaluateBody" (F, argumentsList) => {
    access __x0__ = (F["ECMAScriptCode"] "EvaluateBody")
    app __x1__ = (__x0__ F argumentsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
