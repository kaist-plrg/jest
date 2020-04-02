package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsConcatSpreadable {
  val length: Int = 1
  val func: Func = parseFunc(""""IsConcatSpreadable" (O) => {
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (Get O SYMBOL_isConcatSpreadable)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let spreadable = __x2__
    if (! (= spreadable undefined)) {
      app __x3__ = (ToBoolean spreadable)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (IsArray O)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }""")
}