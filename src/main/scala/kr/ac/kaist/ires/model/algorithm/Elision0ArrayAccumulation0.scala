package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Elision0ArrayAccumulation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""Elision0ArrayAccumulation0" (this) => {
    let len = (+ nextIndex 1i)
    app __x0__ = (Set array "length" len true)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (WrapCompletion len)
    return __x1__
  }""")
}
