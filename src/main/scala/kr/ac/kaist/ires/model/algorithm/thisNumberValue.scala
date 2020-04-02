package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object thisNumberValue {
  val length: Int = 0
  val func: Func = parseFunc(""""thisNumberValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ Number) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["NumberData"] absent))) {
      let n = value["NumberData"]
      app __x3__ = (Type n)
      assert (= __x3__ Number)
      app __x4__ = (WrapCompletion n)
      return __x4__
    } else {}
    app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x5__
  }""")
}