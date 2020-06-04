package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PromiseReactionJob extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""PromiseReactionJob" (reaction, argument) => {
    let promiseCapability = reaction["Capability"]
    let type = reaction["Type"]
    let handler = reaction["Handler"]
    if (= handler undefined) if (= type "Fulfill") {
      app __x0__ = (NormalCompletion argument)
      let handlerResult = __x0__
    } else {
      assert (= type "Reject")
      app __x1__ = (ThrowCompletion argument)
      let handlerResult = __x1__
    } else {
      app __x2__ = (Call handler undefined (new [argument]))
      let handlerResult = __x2__
    }
    if (= promiseCapability undefined) {
      app __x3__ = (IsAbruptCompletion handlerResult)
      assert (! __x3__)
      app __x4__ = (NormalCompletion CONST_empty)
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (IsAbruptCompletion handlerResult)
    if __x6__ {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [handlerResult["Value"]]))
      let status = __x7__
    } else {
      app __x8__ = (Call promiseCapability["Resolve"] undefined (new [handlerResult["Value"]]))
      let status = __x8__
    }
    app __x9__ = (Completion status)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }""")
}
