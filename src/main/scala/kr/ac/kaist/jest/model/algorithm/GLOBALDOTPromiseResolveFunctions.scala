package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTPromiseResolveFunctions extends Algorithm {
  val name: String = "GLOBALDOTPromiseResolveFunctions"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.PromiseResolveFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let resolution = __x0__
    let F = GLOBAL_context["Function"]
    let promise = F["Promise"]
    let alreadyResolved = F["AlreadyResolved"]
    if (= alreadyResolved["Value"] true) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    alreadyResolved["Value"] = true
    app __x2__ = (SameValue resolution promise)
    if (= __x2__ true) {
      let selfResolutionError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x3__ = (RejectPromise promise selfResolutionError)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (Type resolution)
    if (! (= __x5__ Object)) {
      app __x6__ = (FulfillPromise promise resolution)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (Get resolution "then")
    let then = __x8__
    app __x9__ = (IsAbruptCompletion then)
    if __x9__ {
      app __x10__ = (RejectPromise promise then["Value"])
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    let thenAction = then["Value"]
    app __x12__ = (IsCallable thenAction)
    if (= __x12__ false) {
      app __x13__ = (FulfillPromise promise resolution)
      app __x14__ = (WrapCompletion __x13__)
      return __x14__
    } else {}
    app __x15__ = (NewPromiseResolveThenableJob promise resolution thenAction)
    let job = __x15__
    app __x16__ = (HostEnqueuePromiseJob job["Job"] job["Realm"])
    __x16__
    app __x17__ = (WrapCompletion undefined)
    return __x17__
  }"""), this)
}
