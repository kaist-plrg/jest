package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorValue {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""IteratorValue" (iterResult) => {
    app __x0__ = (Type iterResult)
    assert (= __x0__ Object)
    app __x1__ = (Get iterResult "value")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
