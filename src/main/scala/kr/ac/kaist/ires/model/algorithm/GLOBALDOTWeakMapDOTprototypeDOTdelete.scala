package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakMapDOTprototypeDOTdelete extends Algorithm {
  val name: String = "GLOBALDOTWeakMapDOTprototypeDOTdelete"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.WeakMap.prototype.delete" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    let M = this
    app __x1__ = (Type M)
    if (! (= __x1__ Object)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    if (= M["WeakMapData"] absent) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    let entries = M["WeakMapData"]
    app __x4__ = (Type key)
    if (! (= __x4__ Object)) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    let __x6__ = entries
    let __x7__ = 0i
    while (< __x7__ __x6__["length"]) {
      let p = __x6__[__x7__]
      let __x8__ = (! (= p["Key"] CONST_empty))
      if __x8__ {
        app __x9__ = (SameValue p["Key"] key)
        __x8__ = (= __x9__ true)
      } else {}
      if __x8__ {
        p["Key"] = CONST_empty
        p["Value"] = CONST_empty
        app __x10__ = (WrapCompletion true)
        return __x10__
      } else {}
      __x7__ = (+ __x7__ 1i)
    }
    app __x11__ = (WrapCompletion false)
    return __x11__
  }"""), this)
}
