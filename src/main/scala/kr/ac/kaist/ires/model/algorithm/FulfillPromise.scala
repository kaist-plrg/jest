package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FulfillPromise extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""FulfillPromise" (promise, value) => {
    assert (= promise["PromiseState"] "pending")
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "fulfilled"
    app __x0__ = (TriggerPromiseReactions reactions value)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
