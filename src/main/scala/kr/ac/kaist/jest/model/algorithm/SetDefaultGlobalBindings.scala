package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SetDefaultGlobalBindings extends Algorithm {
  val name: String = "SetDefaultGlobalBindings"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SetDefaultGlobalBindings" (realmRec) => {
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
    global["SubMap"]["globalThis"]["Value"] = global
    app __x3__ = (WrapCompletion global)
    return __x3__
  }"""), this)
}
