package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TrimString extends Algorithm {
  val name: String = "TrimString"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""TrimString" (string, where) => {
    app __x0__ = (RequireObjectCoercible string)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let str = __x0__
    app __x1__ = (ToString str)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    if (= where CONST_start) let T = S.ltrim
    else if (= where CONST_end) let T = S.rtrim
    else {
      assert (= where CONST_startPLUSend)
      let T = S.ltrim.rtrim
    }
    app __x2__ = (WrapCompletion T)
    return __x2__
  }"""), this)
}
