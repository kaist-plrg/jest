package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTWeakMapDOTprototypeDOTset extends Algorithm {
  val name: String = "GLOBALDOTWeakMapDOTprototypeDOTset"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.WeakMap.prototype.set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "WeakMapData")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let entries = M["WeakMapData"]
    app __x3__ = (Type key)
    if (! (= __x3__ Object)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    let __x5__ = entries
    let __x6__ = 0i
    while (< __x6__ __x5__["length"]) {
      let p = __x5__[__x6__]
      let __x7__ = (! (= p["Key"] CONST_empty))
      if __x7__ {
        app __x8__ = (SameValue p["Key"] key)
        __x7__ = (= __x8__ true)
      } else {}
      if __x7__ {
        p["Value"] = value
        app __x9__ = (WrapCompletion M)
        return __x9__
      } else {}
      __x6__ = (+ __x6__ 1i)
    }
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x10__ = (WrapCompletion M)
    return __x10__
  }"""), this)
}
