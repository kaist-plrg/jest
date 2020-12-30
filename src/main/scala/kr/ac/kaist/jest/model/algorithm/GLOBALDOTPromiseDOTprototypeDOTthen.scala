package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTPromiseDOTprototypeDOTthen extends Algorithm {
  val name: String = "GLOBALDOTPromiseDOTprototypeDOTthen"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Promise.prototype.then" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let onFulfilled = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let onRejected = __x1__
    let promise = this
    app __x2__ = (IsPromise promise)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (SpeciesConstructor promise INTRINSIC_Promise)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let C = __x4__
    app __x5__ = (NewPromiseCapability C)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let resultCapability = __x5__
    app __x6__ = (PerformPromiseThen promise onFulfilled onRejected resultCapability)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
