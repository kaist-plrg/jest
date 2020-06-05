package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncFromSyncIteratorContinuation extends Algorithm {
  val name: String = "GLOBALDOTAsyncFromSyncIteratorContinuation"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.AsyncFromSyncIteratorContinuation" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let result = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let promiseCapability = __x1__
    app __x2__ = (IteratorComplete result)
    let done = __x2__
    if (is-completion done) if (= done["Type"] CONST_normal) done = done["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [done["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    done
    app __x4__ = (IteratorValue result)
    let value = __x4__
    if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [value["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    value
    app __x6__ = (PromiseResolve INTRINSIC_Promise (new [value]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let valueWrapper = __x6__
    let steps = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions))
    app __x7__ = (CreateBuiltinFunction steps (new ["Done"]))
    let onFulfilled = __x7__
    onFulfilled["Done"] = done
    app __x8__ = (PerformPromiseThen valueWrapper onFulfilled undefined promiseCapability)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    __x8__
    app __x9__ = (WrapCompletion promiseCapability["Promise"])
    return __x9__
  }"""), this)
}
