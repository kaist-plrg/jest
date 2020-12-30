package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TriggerPromiseReactions extends Algorithm {
  val name: String = "TriggerPromiseReactions"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TriggerPromiseReactions" (reactions, argument) => {
    let __x0__ = reactions
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let reaction = __x0__[__x1__]
      app __x2__ = (NewPromiseReactionJob reaction argument)
      let job = __x2__
      app __x3__ = (HostEnqueuePromiseJob job["Job"] job["Realm"])
      __x3__
      __x1__ = (+ __x1__ 1i)
    }
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }"""), this)
}
