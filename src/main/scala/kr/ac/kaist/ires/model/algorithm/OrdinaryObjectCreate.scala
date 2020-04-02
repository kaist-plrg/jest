package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryObjectCreate {
  val length: Int = 1
  val func: Func = parseFunc(""""OrdinaryObjectCreate" (proto, additionalInternalSlotsList) => {
    let internalSlotsList = (new ["Prototype", "Extensible"])
    if (= additionalInternalSlotsList absent) {
      let __x0__ = additionalInternalSlotsList
      let __x1__ = 0i
      while (< __x1__ __x0__["length"]) {
        let __x2__ = __x0__[__x1__]
        append __x2__ -> internalSlotsList
        __x1__ = (+ __x1__ 1i)
      }
    } else {}
    app __x3__ = (MakeBasicObject internalSlotsList)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    O["Prototype"] = proto
    app __x4__ = (WrapCompletion O)
    return __x4__
  }""")
}
