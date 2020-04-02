package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetFunctionLength {
  val length: Int = 2
  val func: Func = parseFunc(""""SetFunctionLength" (F, length) => {
    app __x0__ = (Type length)
    assert (= __x0__ Number)
    app __x1__ = (DefinePropertyOrThrow F "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
