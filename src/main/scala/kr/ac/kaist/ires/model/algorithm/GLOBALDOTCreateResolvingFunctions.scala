package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTCreateResolvingFunctions {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.CreateResolvingFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    let alreadyResolved = (new Record("Value" -> false))
    let stepsResolve = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseResolveFunctions))
    app __x1__ = (CreateBuiltinFunction stepsResolve (new ["Promise", "AlreadyResolved"]))
    let resolve = __x1__
    resolve["Promise"] = promise
    resolve["AlreadyResolved"] = alreadyResolved
    let stepsReject = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseRejectFunctions))
    app __x2__ = (CreateBuiltinFunction stepsReject (new ["Promise", "AlreadyResolved"]))
    let reject = __x2__
    reject["Promise"] = promise
    reject["AlreadyResolved"] = alreadyResolved
    app __x3__ = (WrapCompletion (new Record("Resolve" -> resolve, "Reject" -> reject)))
    return __x3__
  }""")
}
