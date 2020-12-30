package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FulfillPromise extends Algorithm {
  val name: String = "FulfillPromise"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FulfillPromise" (promise, value) => {
    assert (= promise["PromiseState"] CONST_pending)
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = CONST_fulfilled
    app __x0__ = (TriggerPromiseReactions reactions value)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
