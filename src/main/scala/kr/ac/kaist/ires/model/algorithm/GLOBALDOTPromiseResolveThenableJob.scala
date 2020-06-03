package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseResolveThenableJob {
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.PromiseResolveThenableJob" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promiseToResolve = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thenable = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let then = __x2__
    app __x3__ = (CreateResolvingFunctions promiseToResolve)
    let resolvingFunctions = __x3__
    app __x4__ = (Call then thenable (new [resolvingFunctions["Resolve"], resolvingFunctions["Reject"]]))
    let thenCallResult = __x4__
    app __x5__ = (IsAbruptCompletion thenCallResult)
    if __x5__ {
      app __x6__ = (Call resolvingFunctions["Reject"] undefined (new [thenCallResult["Value"]]))
      let status = __x6__
      app __x7__ = (Completion status)
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    } else {}
    app __x9__ = (Completion thenCallResult)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }""")
}
