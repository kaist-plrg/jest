package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberToString extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""NumberToString" (m) => {
    if (= m NaN) {
      app __x0__ = (WrapCompletion "NaN")
      return __x0__
    } else {}
    if (|| (= m 0i) (= m -0.0)) {
      app __x1__ = (WrapCompletion "0")
      return __x1__
    } else {}
    if (< m 0i) {
      app __x2__ = (NumberToString (- m))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion (+ "-" __x2__))
      return __x3__
    } else {}
    if (= m Infinity) {
      app __x4__ = (WrapCompletion "Infinity")
      return __x4__
    } else return (convert m num2str )
  }""")
}
