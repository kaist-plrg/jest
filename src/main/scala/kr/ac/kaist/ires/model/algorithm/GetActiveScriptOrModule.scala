package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetActiveScriptOrModule extends Algorithm {
  val name: String = "GetActiveScriptOrModule"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetActiveScriptOrModule" () => {
    if (= GLOBAL_executionStack["length"] 0i) {
      app __x0__ = (WrapCompletion null)
      return __x0__
    } else {}
    let __x1__ = GLOBAL_executionStack
    let __x2__ = __x1__["length"]
    while (< 0i __x2__) {
      __x2__ = (- __x2__ 1i)
      let ec = __x1__[__x2__]
      if (! (= ec["ScriptOrModule"] null)) return ec["ScriptOrModule"] else {}
    }
    return null
  }"""), this)
}
