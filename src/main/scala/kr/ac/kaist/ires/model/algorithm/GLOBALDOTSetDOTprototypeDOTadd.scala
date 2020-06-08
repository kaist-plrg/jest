package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSetDOTprototypeDOTadd extends Algorithm {
  val name: String = "GLOBALDOTSetDOTprototypeDOTadd"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Set.prototype.add" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "SetData")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = S["SetData"]
    let __x2__ = entries
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let e = __x2__[__x3__]
      let __x4__ = (! (= e CONST_empty))
      if __x4__ {
        app __x5__ = (SameValueZero e value)
        __x4__ = (= __x5__ true)
      } else {}
      if __x4__ {
        app __x6__ = (WrapCompletion S)
        return __x6__
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    if (= value -0.0) value = 0i else {}
    append value -> entries
    app __x7__ = (WrapCompletion S)
    return __x7__
  }"""), this)
}
