package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTisSafeInteger {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Number.isSafeInteger" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (IsInteger number)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    if (= __x1__ true) {
      app __x2__ = (abs number)
      if (! (< (- 9007199254740992i 1i) __x2__)) {
        app __x3__ = (WrapCompletion true)
        return __x3__
      } else {}
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }""")
}
