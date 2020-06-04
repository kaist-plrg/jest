package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTBooleanDOTprototypeDOTtoString extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Boolean.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisBooleanValue this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let b = __x0__
    if (= b true) {
      app __x1__ = (WrapCompletion "true")
      return __x1__
    } else {
      app __x2__ = (WrapCompletion "false")
      return __x2__
    }
  }""")
}
