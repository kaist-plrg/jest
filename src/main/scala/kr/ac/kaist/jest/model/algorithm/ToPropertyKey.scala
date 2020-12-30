package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToPropertyKey extends Algorithm {
  val name: String = "ToPropertyKey"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToPropertyKey" (argument) => {
    app __x0__ = (ToPrimitive argument String)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let key = __x0__
    app __x1__ = (Type key)
    if (= __x1__ Symbol) {
      app __x2__ = (WrapCompletion key)
      return __x2__
    } else {}
    app __x3__ = (ToString key)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
