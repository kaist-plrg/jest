package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseReactionJob {
  val length: Int = 2
  val func: Func = parseFunc(""""GLOBAL.PromiseReactionJob" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reaction = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argument = __x1__
    let promiseCapability = reaction["Capability"]
    let type = reaction["Type"]
    let handler = reaction["Handler"]
    if (= handler undefined) if (= type "Fulfill") {
      app __x2__ = (NormalCompletion argument)
      let handlerResult = __x2__
    } else {
      assert (= type "Reject")
      app __x3__ = (ThrowCompletion argument)
      let handlerResult = __x3__
    } else {
      app __x4__ = (Call handler undefined (new [argument]))
      let handlerResult = __x4__
    }
    if (= promiseCapability undefined) {
      app __x5__ = (IsAbruptCompletion handlerResult)
      assert (! __x5__)
      app __x6__ = (NormalCompletion CONST_empty)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (IsAbruptCompletion handlerResult)
    if __x8__ {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [handlerResult["Value"]]))
      let status = __x9__
    } else {
      app __x10__ = (Call promiseCapability["Resolve"] undefined (new [handlerResult["Value"]]))
      let status = __x10__
    }
    app __x11__ = (Completion status)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }""")
}
