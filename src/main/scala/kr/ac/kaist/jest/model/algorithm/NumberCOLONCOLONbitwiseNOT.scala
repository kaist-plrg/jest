package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONbitwiseNOT extends Algorithm {
  val name: String = "NumberCOLONCOLONbitwiseNOT"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::bitwiseNOT" (x) => {
    app __x0__ = (ToInt32 x)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let oldValue = __x0__
    app __x1__ = (WrapCompletion (~ oldValue))
    return __x1__
  }"""), this)
}
