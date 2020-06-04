package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTisInteger extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Number.isInteger" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (Type number)
    if (! (= __x1__ Number)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (|| (|| (= number NaN) (= number Infinity)) (= number -Infinity)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    app __x4__ = (ToInteger number)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let integer = __x4__
    if (! (= integer number)) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion true)
      return __x6__
    }
  }""")
}
