package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SplitMatch extends Algorithm {
  val name: String = "SplitMatch"
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""SplitMatch" (S, q, R) => {
    app __x0__ = (Type R)
    assert (= __x0__ String)
    let r = R["length"]
    let s = S["length"]
    if (< s (+ q r)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    let i = 0i
    while (< i r) {
      if (! (= S[(+ q i)] R[i])) return false
      else i = (+ i 1i)
    }
    app __x2__ = (WrapCompletion (+ q r))
    return __x2__
  }"""), this)
}
