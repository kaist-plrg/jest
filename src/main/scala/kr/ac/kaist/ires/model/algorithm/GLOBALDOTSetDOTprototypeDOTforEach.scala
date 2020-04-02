package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSetDOTprototypeDOTforEach {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Set.prototype.forEach" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    let S = this
    app __x2__ = (Type S)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (= S["SetData"] absent) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (IsCallable callbackfn)
    if (= __x5__ false) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    let entries = S["SetData"]
    let __x7__ = entries
    let __x8__ = 0i
    while (< __x8__ __x7__["length"]) {
      let e = __x7__[__x8__]
      if (! (= e CONST_empty)) {
        app __x9__ = (Call callbackfn T (new [e, e, S]))
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x9__
      } else {}
      __x8__ = (+ __x8__ 1i)
    }
    app __x10__ = (WrapCompletion undefined)
    return __x10__
  }""")
}
