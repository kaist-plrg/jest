package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryCreateFromConstructor extends Algorithm {
  val name: String = "OrdinaryCreateFromConstructor"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryCreateFromConstructor" (constructor, intrinsicDefaultProto, internalSlotsList) => {
    app __x0__ = (GetPrototypeFromConstructor constructor intrinsicDefaultProto)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (OrdinaryObjectCreate proto internalSlotsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
