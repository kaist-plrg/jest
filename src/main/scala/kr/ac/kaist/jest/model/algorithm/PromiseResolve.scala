package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PromiseResolve extends Algorithm {
  val name: String = "PromiseResolve"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PromiseResolve" (C, x) => {
    app __x0__ = (Type C)
    assert (= __x0__ Object)
    app __x1__ = (IsPromise x)
    if (= __x1__ true) {
      app __x2__ = (Get x "constructor")
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let xConstructor = __x2__
      app __x3__ = (SameValue xConstructor C)
      if (= __x3__ true) {
        app __x4__ = (WrapCompletion x)
        return __x4__
      } else {}
    } else {}
    app __x5__ = (NewPromiseCapability C)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let promiseCapability = __x5__
    app __x6__ = (Call promiseCapability["Resolve"] undefined (new [x]))
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    app __x7__ = (WrapCompletion promiseCapability["Promise"])
    return __x7__
  }"""), this)
}
