package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateResolvingFunctions extends Algorithm {
  val name: String = "CreateResolvingFunctions"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateResolvingFunctions" (promise) => {
    let alreadyResolved = (new Record("Value" -> false))
    let stepsResolve = (new algorithm ("length" -> 1i, "step" -> GLOBALDOTPromiseResolveFunctions))
    app __x0__ = (CreateBuiltinFunction stepsResolve (new ["Promise", "AlreadyResolved"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let resolve = __x0__
    resolve["Promise"] = promise
    resolve["AlreadyResolved"] = alreadyResolved
    let stepsReject = (new algorithm ("length" -> 1i, "step" -> GLOBALDOTPromiseRejectFunctions))
    app __x1__ = (CreateBuiltinFunction stepsReject (new ["Promise", "AlreadyResolved"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let reject = __x1__
    reject["Promise"] = promise
    reject["AlreadyResolved"] = alreadyResolved
    app __x2__ = (WrapCompletion (new Record("Resolve" -> resolve, "Reject" -> reject)))
    return __x2__
  }"""), this)
}
