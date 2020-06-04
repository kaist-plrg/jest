package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsPropertyKey extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""IsPropertyKey" (argument) => {
    app __x0__ = (Type argument)
    if (= __x0__ String) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (Type argument)
    if (= __x2__ Symbol) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }""")
}
