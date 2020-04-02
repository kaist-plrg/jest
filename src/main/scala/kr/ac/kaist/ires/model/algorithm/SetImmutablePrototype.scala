package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetImmutablePrototype {
  val length: Int = 2
  val func: Func = parseFunc(""""SetImmutablePrototype" (O, V) => {
    app __x0__ = (O["GetPrototypeOf"] O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let current = __x0__
    app __x1__ = (SameValue V current)
    if (= __x1__ true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }""")
}