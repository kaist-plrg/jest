package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""OrdinaryObject.OwnPropertyKeys" (O) => {
    app __x0__ = (OrdinaryOwnPropertyKeys O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
