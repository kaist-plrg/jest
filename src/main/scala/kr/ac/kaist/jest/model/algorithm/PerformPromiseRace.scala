package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PerformPromiseRace extends Algorithm {
  val name: String = "PerformPromiseRace"
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""PerformPromiseRace" (iteratorRecord, constructor, resultCapability) => {
    app __x0__ = (IsConstructor constructor)
    assert (= __x0__ true)
    app __x1__ = (Get constructor "resolve")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseResolve = __x1__
    app __x2__ = (IsCallable promiseResolve)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    while true {
      app __x4__ = (IteratorStep iteratorRecord)
      let next = __x4__
      app __x5__ = (IsAbruptCompletion next)
      if __x5__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        app __x6__ = (WrapCompletion resultCapability["Promise"])
        return __x6__
      } else {}
      app __x7__ = (IteratorValue next)
      let nextValue = __x7__
      app __x8__ = (IsAbruptCompletion nextValue)
      if __x8__ iteratorRecord["Done"] = true else {}
      if (is-completion nextValue) if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x9__ = (Call promiseResolve constructor (new [nextValue]))
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let nextPromise = __x9__
      app __x10__ = (Invoke nextPromise "then" (new [resultCapability["Resolve"], resultCapability["Reject"]]))
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      __x10__
    }
  }"""), this)
}
