package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Elision0ArrayAccumulation0 extends Algorithm {
  val name: String = "Elision0ArrayAccumulation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Elision0ArrayAccumulation0" (this, array, nextIndex) => {
    let len = (+ nextIndex 1i)
    app __x0__ = (Set array "length" len true)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (WrapCompletion len)
    return __x1__
  }"""), this)
}
