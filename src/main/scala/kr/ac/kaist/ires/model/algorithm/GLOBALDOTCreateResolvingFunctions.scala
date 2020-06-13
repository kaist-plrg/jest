package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTCreateResolvingFunctions extends Algorithm {
  val name: String = "GLOBALDOTCreateResolvingFunctions"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.CreateResolvingFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    let alreadyResolved = (new Record("Value" -> false))
    let stepsResolve = (new algorithm ("length" -> 1i, "step" -> GLOBALDOTPromiseResolveFunctions))
    app __x1__ = (CreateBuiltinFunction stepsResolve (new ["Promise", "AlreadyResolved"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let resolve = __x1__
    resolve["Promise"] = promise
    resolve["AlreadyResolved"] = alreadyResolved
    let stepsReject = (new algorithm ("length" -> 1i, "step" -> GLOBALDOTPromiseRejectFunctions))
    app __x2__ = (CreateBuiltinFunction stepsReject (new ["Promise", "AlreadyResolved"]))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let reject = __x2__
    reject["Promise"] = promise
    reject["AlreadyResolved"] = alreadyResolved
    app __x3__ = (WrapCompletion (new Record("Resolve" -> resolve, "Reject" -> reject)))
    return __x3__
  }"""), this)
}
