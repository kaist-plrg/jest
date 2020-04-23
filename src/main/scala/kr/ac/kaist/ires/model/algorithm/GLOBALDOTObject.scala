package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObject {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.Object" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (! (|| (= NewTarget undefined) (= NewTarget GLOBAL_context["Function"]))) {
      app __x1__ = (OrdinaryCreateFromConstructor NewTarget INTRINSIC_ObjectPrototype)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    if (|| (|| (= value null) (= value undefined)) (= value absent)) {
      app __x3__ = (ObjectCreate INTRINSIC_ObjectPrototype)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (ToObject value)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }""")
}
