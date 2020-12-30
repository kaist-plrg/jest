package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CallExpression3Evaluation0 extends Algorithm {
  val name: String = "CallExpression3Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression3Evaluation0" (this, CallExpression, Arguments) => {
    access ref = (CallExpression "Evaluation")
    app func = (GetValue ref)
    ? func
    let thisCall = this
    app tailCall = (IsInTailPosition thisCall)
    app result = (EvaluateCall func ref Arguments tailCall)
    ? result
    app wrapped = (WrapCompletion result)
    return wrapped
  }"""), this)
}
