package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFulfillPromise extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.FulfillPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    assert (= promise["PromiseState"] "pending")
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "fulfilled"
    app __x2__ = (TriggerPromiseReactions reactions value)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
