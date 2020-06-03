package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTMapDOTprototypeDOTset {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Map.prototype.set" (this, argumentsList, NewTarget) => {
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
    if (= M["MapData"] absent) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    let entries = M["MapData"]
    let __x5__ = entries
    let __x6__ = 0i
    while (< __x6__ __x5__["length"]) {
      let p = __x5__[__x6__]
      let __x7__ = (! (= p["Key"] CONST_empty))
      if __x7__ {
        app __x8__ = (SameValueZero p["Key"] key)
        __x7__ = (= __x8__ true)
      } else {}
      if __x7__ {
        p["Value"] = value
        app __x9__ = (WrapCompletion M)
        return __x9__
      } else {}
      __x6__ = (+ __x6__ 1i)
    }
    if (= key -0.0) key = 0i else {}
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x10__ = (WrapCompletion M)
    return __x10__
  }""")
}
