package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONtoString extends Algorithm {
  val name: String = "BigIntCOLONCOLONtoString"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::toString" (x) => {
    if (< x 0i) {
      access __x0__ = (PRIMITIVES BigInt)
      access __x1__ = (__x0__ "toString")
      app __x2__ = (__x1__ (- x))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion (+ "-" __x2__))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion (convert x num2str ))
    return __x4__
  }"""), this)
}
