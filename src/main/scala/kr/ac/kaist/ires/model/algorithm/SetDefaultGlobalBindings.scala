package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetDefaultGlobalBindings {
  val length: Int = 1
  val func: Func = parseFunc(""""SetDefaultGlobalBindings" (realmRec) => {
    let global = realmRec["GlobalObject"]
    let __x0__ = (map-keys GLOBAL)
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let name = __x0__[__x1__]
      let desc = GLOBAL[name]
      app __x2__ = (DefinePropertyOrThrow global name desc)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x1__ = (+ __x1__ 1i)
    }
    app __x3__ = (WrapCompletion global)
    return __x3__
  }""")
}
