package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTPromiseDOTprototypeDOTfinally extends Algorithm {
  val name: String = "GLOBALDOTPromiseDOTprototypeDOTfinally"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Promise.prototype.finally" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let onFinally = __x0__
    let promise = this
    app __x1__ = (Type promise)
    if (! (= __x1__ Object)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (SpeciesConstructor promise INTRINSIC_Promise)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let C = __x3__
    app __x4__ = (IsConstructor C)
    assert (= __x4__ true)
    app __x5__ = (IsCallable onFinally)
    if (= __x5__ false) {
      let thenFinally = onFinally
      let catchFinally = onFinally
    } else {
      let stepsThenFinally = (new algorithm ("length" -> 1i, "step" -> GLOBALDOTThenFinallyFunctions))
      app __x6__ = (CreateBuiltinFunction stepsThenFinally (new ["Constructor", "OnFinally"]))
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let thenFinally = __x6__
      thenFinally["Constructor"] = C
      thenFinally["OnFinally"] = onFinally
      let stepsCatchFinally = (new algorithm ("length" -> 1i, "step" -> GLOBALDOTCatchFinallyFunctions))
      app __x7__ = (CreateBuiltinFunction stepsCatchFinally (new ["Constructor", "OnFinally"]))
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let catchFinally = __x7__
      catchFinally["Constructor"] = C
      catchFinally["OnFinally"] = onFinally
    }
    app __x8__ = (Invoke promise "then" (new [thenFinally, catchFinally]))
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
