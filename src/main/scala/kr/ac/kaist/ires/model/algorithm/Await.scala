package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Await extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Await" (value) => {
    let asyncContext = GLOBAL_context
    app __x0__ = (PromiseResolve INTRINSIC_Promise value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promise = __x0__
    let stepsFulfilled = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAwaitFulfilledFunctions))
    app __x1__ = (CreateBuiltinFunction stepsFulfilled (new ["AsyncContext"]))
    let onFulfilled = __x1__
    onFulfilled["AsyncContext"] = asyncContext
    let stepsRejected = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAwaitRejectedFunctions))
    app __x2__ = (CreateBuiltinFunction stepsRejected (new ["AsyncContext"]))
    let onRejected = __x2__
    onRejected["AsyncContext"] = asyncContext
    app __x3__ = (PerformPromiseThen promise onFulfilled onRejected)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
      __x4__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x4__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    access __ret__ = (asyncContext "ReturnCont")
    __ret__ = (pop __ret__ 0i)
    asyncContext["ResumeCont"] = (completion) [=>] return completion
    app __x5__ = (NormalCompletion undefined)
    app __x6__ = (__ret__ __x5__)
  }"""))
}
