package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SplitMatch {
  val length: Int = 3
  val func: Func = parseFunc(""""SplitMatch" (S, q, R) => {
    app __x0__ = (Type R)
    assert (= __x0__ String)
    let r = R["length"]
    let s = S["length"]
    if (< s (+ q r)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    !!! "NumberOp"
    app __x2__ = (WrapCompletion (+ q r))
    return __x2__
  }""")
}