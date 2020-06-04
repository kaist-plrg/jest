package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPerformPromiseThen extends Algorithm {
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.PerformPromiseThen" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let onFulfilled = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let onRejected = __x2__
    app __x3__ = (GetArgument argumentsList 3i)
    let resultCapability = __x3__
    app __x4__ = (IsPromise promise)
    assert (= __x4__ true)
    if (! (= argumentsList[3i] absent)) {} else resultCapability = undefined
    app __x5__ = (IsCallable onFulfilled)
    if (= __x5__ false) onFulfilled = undefined else {}
    app __x6__ = (IsCallable onRejected)
    if (= __x6__ false) onRejected = undefined else {}
    let fulfillReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Fulfill", "Handler" -> onFulfilled))
    let rejectReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Reject", "Handler" -> onRejected))
    if (= promise["PromiseState"] "pending") {
      append fulfillReaction -> promise["PromiseFulfillReactions"]
      append rejectReaction -> promise["PromiseRejectReactions"]
    } else if (= promise["PromiseState"] "fulfilled") {
      let value = promise["PromiseResult"]
      app __x7__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [fulfillReaction, value]))
      __x7__
    } else {
      assert (= promise["PromiseState"] "rejected")
      let reason = promise["PromiseResult"]
      if (= promise["PromiseIsHandled"] false) {
        app __x8__ = (HostPromiseRejectionTracker promise "handle")
        __x8__
      } else {}
      app __x9__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [rejectReaction, reason]))
      __x9__
    }
    promise["PromiseIsHandled"] = true
    if (= resultCapability undefined) {
      app __x10__ = (WrapCompletion undefined)
      return __x10__
    } else {
      app __x11__ = (WrapCompletion resultCapability["Promise"])
      return __x11__
    }
  }"""))
}
