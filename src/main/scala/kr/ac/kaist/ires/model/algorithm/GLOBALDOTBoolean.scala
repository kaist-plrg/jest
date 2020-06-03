package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTBoolean {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Boolean" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    app __x1__ = (ToBoolean value)
    let b = __x1__
    if (= NewTarget undefined) {
      app __x2__ = (WrapCompletion b)
      return __x2__
    } else {}
    app __x3__ = (OrdinaryCreateFromConstructor NewTarget INTRINSIC_BooleanPrototype (new ["BooleanData"]))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    O["BooleanData"] = b
    app __x4__ = (WrapCompletion O)
    return __x4__
  }""")
}
