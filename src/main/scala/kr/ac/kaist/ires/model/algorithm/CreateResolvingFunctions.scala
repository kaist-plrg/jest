package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateResolvingFunctions extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""CreateResolvingFunctions" (promise) => {
    let alreadyResolved = (new Record("Value" -> false))
    let stepsResolve = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseResolveFunctions))
    app __x0__ = (CreateBuiltinFunction stepsResolve (new ["Promise", "AlreadyResolved"]))
    let resolve = __x0__
    resolve["Promise"] = promise
    resolve["AlreadyResolved"] = alreadyResolved
    let stepsReject = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseRejectFunctions))
    app __x1__ = (CreateBuiltinFunction stepsReject (new ["Promise", "AlreadyResolved"]))
    let reject = __x1__
    reject["Promise"] = promise
    reject["AlreadyResolved"] = alreadyResolved
    app __x2__ = (WrapCompletion (new Record("Resolve" -> resolve, "Reject" -> reject)))
    return __x2__
  }""")
}
