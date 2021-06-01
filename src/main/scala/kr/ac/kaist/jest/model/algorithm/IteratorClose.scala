package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IteratorClose extends Algorithm {
  val name: String = "IteratorClose"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IteratorClose" (iteratorRecord, completion) => {
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
    if (= completion["Type"] CONST_throw) {
      app __x5__ = (Completion completion)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    if (= innerResult["Type"] CONST_throw) {
      app __x7__ = (Completion innerResult)
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    } else {}
    app __x9__ = (Type innerResult["Value"])
    if (! (= __x9__ Object)) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    app __x11__ = (Completion completion)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }"""), this)
}
