package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTMapDOTprototypeDOTset extends Algorithm {
  val name: String = "GLOBALDOTMapDOTprototypeDOTset"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Map.prototype.set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "MapData")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let entries = M["MapData"]
    let __x3__ = entries
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let p = __x3__[__x4__]
      let __x5__ = (! (= p["Key"] CONST_empty))
      if __x5__ {
        app __x6__ = (SameValueZero p["Key"] key)
        __x5__ = (= __x6__ true)
      } else {}
      if __x5__ {
        p["Value"] = value
        app __x7__ = (WrapCompletion M)
        return __x7__
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    if (= key -0.0) key = 0i else {}
    let p = (new Record("Key" -> key, "Value" -> value))
    append p -> entries
    app __x8__ = (WrapCompletion M)
    return __x8__
  }"""), this)
}
