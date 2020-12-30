package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTCatchFinallyFunctions extends Algorithm {
  val name: String = "GLOBALDOTCatchFinallyFunctions"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.CatchFinallyFunctions" (this, argumentsList, NewTarget) => {
    let reason = argumentsList[0i]
    let F = GLOBAL_context["Function"]
    let onFinally = F["OnFinally"]
    app __x0__ = (IsCallable onFinally)
    assert (= __x0__ true)
    app __x1__ = (Call onFinally undefined)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let result = __x1__
    let C = F["Constructor"]
    app __x2__ = (IsConstructor C)
    assert (= __x2__ true)
    app __x3__ = (PromiseResolve C result)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let promise = __x3__
    let thrower = (new OrdinaryObject("SubMap" -> (new SubMap())))
    thrower.Call = ReturnCaptured
    app value = (ThrowCompletion reason)
    thrower.Captured = value
    app __x4__ = (Invoke promise "then" (new [thrower]))
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
