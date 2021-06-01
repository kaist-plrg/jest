package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PromiseResolveFunctions extends Algorithm {
  val name: String = "PromiseResolveFunctions"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PromiseResolveFunctions" () => {
    let F = GLOBAL_context["Function"]
    let promise = F["Promise"]
    let alreadyResolved = F["AlreadyResolved"]
    if (= alreadyResolved["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyResolved["Value"] = true
    app __x1__ = (SameValue resolution promise)
    if (= __x1__ true) {
      let selfResolutionError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x2__ = (RejectPromise promise selfResolutionError)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Type resolution)
    if (! (= __x4__ Object)) {
      app __x5__ = (FulfillPromise promise resolution)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (Get resolution "then")
    let then = __x7__
    app __x8__ = (IsAbruptCompletion then)
    if __x8__ {
      app __x9__ = (RejectPromise promise then["Value"])
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    let thenAction = then["Value"]
    app __x11__ = (IsCallable thenAction)
    if (= __x11__ false) {
      app __x12__ = (FulfillPromise promise resolution)
      app __x13__ = (WrapCompletion __x12__)
      return __x13__
    } else {}
    app __x14__ = (NewPromiseResolveThenableJob promise resolution thenAction)
    let job = __x14__
    app __x15__ = (HostEnqueuePromiseJob job["Job"] job["Realm"])
    __x15__
    app __x16__ = (WrapCompletion undefined)
    return __x16__
  }"""), this)
}
