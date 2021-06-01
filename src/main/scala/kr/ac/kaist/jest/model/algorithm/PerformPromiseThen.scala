package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PerformPromiseThen extends Algorithm {
  val name: String = "PerformPromiseThen"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PerformPromiseThen" (promise, onFulfilled, onRejected, resultCapability) => {
    app __x0__ = (IsPromise promise)
    assert (= __x0__ true)
    if (! (= resultCapability absent)) {} else resultCapability = undefined
    app __x1__ = (IsCallable onFulfilled)
    if (= __x1__ false) onFulfilled = undefined else {}
    app __x2__ = (IsCallable onRejected)
    if (= __x2__ false) onRejected = undefined else {}
    let fulfillReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> CONST_Fulfill, "Handler" -> onFulfilled))
    let rejectReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> CONST_Reject, "Handler" -> onRejected))
    if (= promise["PromiseState"] CONST_pending) {
      append fulfillReaction -> promise["PromiseFulfillReactions"]
      append rejectReaction -> promise["PromiseRejectReactions"]
    } else if (= promise["PromiseState"] CONST_fulfilled) {
      let value = promise["PromiseResult"]
      app __x3__ = (NewPromiseReactionJob fulfillReaction value)
      let fulfillJob = __x3__
      app __x4__ = (HostEnqueuePromiseJob fulfillJob["Job"] fulfillJob["Realm"])
      __x4__
    } else {
      assert (= promise["PromiseState"] CONST_rejected)
      let reason = promise["PromiseResult"]
      if (= promise["PromiseIsHandled"] false) {
        app __x5__ = (HostPromiseRejectionTracker promise "handle")
        __x5__
      } else {}
      app __x6__ = (NewPromiseReactionJob rejectReaction reason)
      let rejectJob = __x6__
      app __x7__ = (HostEnqueuePromiseJob rejectJob["Job"] rejectJob["Realm"])
      __x7__
    }
    promise["PromiseIsHandled"] = true
    if (= resultCapability undefined) {
      app __x8__ = (WrapCompletion undefined)
      return __x8__
    } else {
      app __x9__ = (WrapCompletion resultCapability["Promise"])
      return __x9__
    }
  }"""), this)
}
