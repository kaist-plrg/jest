package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTisNaN extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Number.isNaN" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (Type number)
    if (! (= __x1__ Number)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= number NaN) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {
      app __x4__ = (WrapCompletion false)
      return __x4__
    }
  }""")
}
