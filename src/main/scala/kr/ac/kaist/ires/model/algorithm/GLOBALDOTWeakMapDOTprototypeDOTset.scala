package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakMapDOTprototypeDOTset extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.WeakMap.prototype.set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let M = this
    app __x2__ = (Type M)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (= M["WeakMapData"] absent) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    let entries = M["WeakMapData"]
    app __x5__ = (Type key)
    if (! (= __x5__ Object)) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    let __x7__ = entries
    let __x8__ = 0i
    while (< __x8__ __x7__["length"]) {
      let p = __x7__[__x8__]
      let __x9__ = (! (= p["Key"] CONST_empty))
      if __x9__ {
        app __x10__ = (SameValue p["Key"] key)
        __x9__ = (= __x10__ true)
      } else {}
      if __x9__ {
        p["Value"] = value
        app __x11__ = (WrapCompletion M)
        return __x11__
      } else {}
      __x8__ = (+ __x8__ 1i)
    }
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x12__ = (WrapCompletion M)
    return __x12__
  }""")
}
