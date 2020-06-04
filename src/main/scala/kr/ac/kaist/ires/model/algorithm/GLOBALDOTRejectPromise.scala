package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTRejectPromise extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.RejectPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reason = __x1__
    assert (= promise["PromiseState"] "pending")
    let reactions = promise["PromiseRejectReactions"]
    promise["PromiseResult"] = reason
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "rejected"
    if (= promise["PromiseIsHandled"] false) {
      app __x2__ = (HostPromiseRejectionTracker promise "reject")
      __x2__
    } else {}
    app __x3__ = (TriggerPromiseReactions reactions reason)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""))
}
