package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TrimString {
  val length: Int = 2
  val func: Func = parseFunc(""""TrimString" (string, where) => {
    app __x0__ = (RequireObjectCoercible string)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let str = __x0__
    app __x1__ = (ToString str)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    if (= where "start") let T = !!! "StringOp" else if (= where "end") let T = !!! "StringOp" else {
      assert (= where "start+end")
      let T = !!! "StringOp"
    }
    app __x2__ = (WrapCompletion T)
    return __x2__
  }""")
}