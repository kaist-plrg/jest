package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncIteratorClose extends Algorithm {
  val name: String = "AsyncIteratorClose"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncIteratorClose" (iteratorRecord, completion) => {
    app __x0__ = (Type iteratorRecord["Iterator"])
    assert (= __x0__ Object)
    assert (is-completion completion)
    let iterator = iteratorRecord["Iterator"]
    app __x1__ = (GetMethod iterator "return")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let return = __x1__
    if (= return undefined) {
      app __x2__ = (Completion completion)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call return iterator)
    let innerResult = __x4__
    if (= innerResult["Type"] CONST_normal) {
      app __x5__ = (Await innerResult["Value"])
      innerResult = __x5__
    } else {}
    if (= completion["Type"] CONST_throw) {
      app __x6__ = (Completion completion)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (= innerResult["Type"] CONST_throw) {
      app __x8__ = (Completion innerResult)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    app __x10__ = (Type innerResult["Value"])
    if (! (= __x10__ Object)) {
      app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x11__
    } else {}
    app __x12__ = (Completion completion)
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }"""), this)
}
