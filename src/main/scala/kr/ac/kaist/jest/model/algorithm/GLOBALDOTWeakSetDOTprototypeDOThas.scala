package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTWeakSetDOTprototypeDOThas extends Algorithm {
  val name: String = "GLOBALDOTWeakSetDOTprototypeDOThas"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.WeakSet.prototype.has" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "WeakSetData")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = S["WeakSetData"]
    app __x2__ = (Type value)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    let __x4__ = entries
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let e = __x4__[__x5__]
      let __x6__ = (! (= e CONST_empty))
      if __x6__ {
        app __x7__ = (SameValue e value)
        __x6__ = (= __x7__ true)
      } else {}
      if __x6__ {
        app __x8__ = (WrapCompletion true)
        return __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x9__ = (WrapCompletion false)
    return __x9__
  }"""), this)
}
