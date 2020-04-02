package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryDelete {
  val length: Int = 2
  val func: Func = parseFunc(""""OrdinaryDelete" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (O["GetOwnProperty"] O P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let desc = __x1__
    if (= desc undefined) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    if (= desc["Configurable"] true) {
      delete O["SubMap"][P]
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }""")
}