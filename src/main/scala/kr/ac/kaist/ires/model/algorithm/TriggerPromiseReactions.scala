package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TriggerPromiseReactions extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""TriggerPromiseReactions" (reactions, argument) => {
    let __x0__ = reactions
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let reaction = __x0__[__x1__]
      app __x2__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [reaction, argument]))
      __x2__
      __x1__ = (+ __x1__ 1i)
    }
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }""")
}
