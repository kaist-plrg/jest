package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Block0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""Block0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
