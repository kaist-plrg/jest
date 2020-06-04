package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RejectPromise extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""RejectPromise" (promise, reason) => {
    assert (= promise["PromiseState"] "pending")
    let reactions = promise["PromiseRejectReactions"]
    promise["PromiseResult"] = reason
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "rejected"
    if (= promise["PromiseIsHandled"] false) {
      app __x0__ = (HostPromiseRejectionTracker promise "reject")
      __x0__
    } else {}
    app __x1__ = (TriggerPromiseReactions reactions reason)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
