package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakSetDOTprototypeDOTadd {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.WeakSet.prototype.add" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (Type S)
    if (! (= __x1__ Object)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    if (= S["WeakSetData"] absent) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (Type value)
    if (! (= __x4__ Object)) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    let entries = S["WeakSetData"]
    let __x6__ = entries
    let __x7__ = 0i
    while (< __x7__ __x6__["length"]) {
      let e = __x6__[__x7__]
      let __x8__ = (! (= e CONST_empty))
      if __x8__ {
        app __x9__ = (SameValue e value)
        __x8__ = (= __x9__ true)
      } else {}
      if __x8__ {
        app __x10__ = (WrapCompletion S)
        return __x10__
      } else {}
      __x7__ = (+ __x7__ 1i)
    }
    append value -> entries
    app __x11__ = (WrapCompletion S)
    return __x11__
  }""")
}
