package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTPromise extends Algorithm {
  val name: String = "GLOBALDOTPromise"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Promise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let executor = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (IsCallable executor)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (OrdinaryCreateFromConstructor NewTarget "%Promise.prototype%" (new ["PromiseState", "PromiseResult", "PromiseFulfillReactions", "PromiseRejectReactions", "PromiseIsHandled"]))
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let promise = __x4__
    promise["PromiseState"] = CONST_pending
    promise["PromiseFulfillReactions"] = (new [])
    promise["PromiseRejectReactions"] = (new [])
    promise["PromiseIsHandled"] = false
    app __x5__ = (CreateResolvingFunctions promise)
    let resolvingFunctions = __x5__
    app __x6__ = (Call executor undefined (new [resolvingFunctions["Resolve"], resolvingFunctions["Reject"]]))
    let completion = __x6__
    app __x7__ = (IsAbruptCompletion completion)
    if __x7__ {
      app __x8__ = (Call resolvingFunctions["Reject"] undefined (new [completion["Value"]]))
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__
    } else {}
    app __x9__ = (WrapCompletion promise)
    return __x9__
  }"""), this)
}
