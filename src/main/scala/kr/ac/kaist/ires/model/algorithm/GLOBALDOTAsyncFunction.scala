package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncFunction {
  val length: Int = 5
  val func: Func = parseFunc(""""GLOBAL.AsyncFunction" (this, argumentsList, NewTarget) => {
    let C = GLOBAL_context["Function"]
    let args = argumentsList
    app __x0__ = (CreateDynamicFunction C NewTarget "async" args)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
