package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object WrapCompletion extends Algorithm {
  val name: String = "WrapCompletion"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""WrapCompletion" (val) => {
    if (is-completion val) {
      return val
    } else {
      app completion = (NormalCompletion val)
      return completion
    }
  }"""), this)
}
