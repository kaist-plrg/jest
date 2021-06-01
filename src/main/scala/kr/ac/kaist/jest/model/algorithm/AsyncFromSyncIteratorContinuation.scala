package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncFromSyncIteratorContinuation extends Algorithm {
  val name: String = "AsyncFromSyncIteratorContinuation"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFromSyncIteratorContinuation" (result, promiseCapability) => {
    app __x0__ = (IteratorComplete result)
    let done = __x0__
    if (is-completion done) if (= done["Type"] CONST_normal) done = done["Value"] else {
      app __x1__ = (Call promiseCapability["Reject"] undefined (new [done["Value"]]))
      if (&& (is-completion __x1__) (! (= __x1__["Type"] CONST_normal))) return __x1__ else {}
      return promiseCapability["Promise"]
    } else {}
    done
    app __x2__ = (IteratorValue result)
    let value = __x2__
    if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [value["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    value
    app __x4__ = (PromiseResolve INTRINSIC_Promise value)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let valueWrapper = __x4__
    if (is-completion valueWrapper) if (= valueWrapper["Type"] CONST_normal) valueWrapper = valueWrapper["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [valueWrapper["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    valueWrapper
    let steps = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions))
    app __x6__ = (CreateBuiltinFunction steps (new ["Done"]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let onFulfilled = __x6__
    onFulfilled["Done"] = done
    app __x7__ = (PerformPromiseThen valueWrapper onFulfilled undefined promiseCapability)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    app __x8__ = (WrapCompletion promiseCapability["Promise"])
    return __x8__
  }"""), this)
}
