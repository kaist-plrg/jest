package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object WrapCompletion extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""WrapCompletion" (val) => {
    if (is-completion val) {
      return val
    } else {
      app completion = (NormalCompletion val)
      return completion
    }
  }""")
}
