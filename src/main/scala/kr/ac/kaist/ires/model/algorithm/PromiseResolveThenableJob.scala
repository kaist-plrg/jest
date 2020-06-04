package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PromiseResolveThenableJob extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = parseFunc(""""PromiseResolveThenableJob" (promiseToResolve, thenable, then) => {
    app __x0__ = (CreateResolvingFunctions promiseToResolve)
    let resolvingFunctions = __x0__
    app __x1__ = (Call then thenable (new [resolvingFunctions["Resolve"], resolvingFunctions["Reject"]]))
    let thenCallResult = __x1__
    app __x2__ = (IsAbruptCompletion thenCallResult)
    if __x2__ {
      app __x3__ = (Call resolvingFunctions["Reject"] undefined (new [thenCallResult["Value"]]))
      let status = __x3__
      app __x4__ = (Completion status)
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Completion thenCallResult)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }""")
}
