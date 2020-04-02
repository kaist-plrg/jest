package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Elision1ArrayAccumulation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""Elision1ArrayAccumulation0" (this, Elision) => {
    access __x0__ = (Elision "ArrayAccumulation")
    app __x1__ = (__x0__ array (+ nextIndex 1i))
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
