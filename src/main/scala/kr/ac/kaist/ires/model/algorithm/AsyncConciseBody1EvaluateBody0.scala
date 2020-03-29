package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncConciseBody1EvaluateBody0 {
  val length: Int = 0
  val func: Func = parseFunc(""""AsyncConciseBody1EvaluateBody0" (this, AsyncFunctionBody, functionObject, argumentsList) => {
    access __x0__ = (AsyncFunctionBody "EvaluateBody")
    app __x1__ = (__x0__ functionObject argumentsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
