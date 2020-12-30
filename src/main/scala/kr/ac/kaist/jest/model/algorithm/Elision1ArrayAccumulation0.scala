package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Elision1ArrayAccumulation0 extends Algorithm {
  val name: String = "Elision1ArrayAccumulation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Elision1ArrayAccumulation0" (this, Elision, array, nextIndex) => {
    access __x0__ = (Elision "ArrayAccumulation")
    app __x1__ = (__x0__ array (+ nextIndex 1i))
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
