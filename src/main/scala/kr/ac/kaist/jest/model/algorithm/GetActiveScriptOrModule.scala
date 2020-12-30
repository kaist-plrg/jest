package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetActiveScriptOrModule extends Algorithm {
  val name: String = "GetActiveScriptOrModule"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetActiveScriptOrModule" () => {
    if (= GLOBAL_executionStack["length"] 0i) {
      app __x0__ = (WrapCompletion null)
      return __x0__
    } else {}
    let len = GLOBAL_executionStack.length
    let k = (- len 1i)
    while (! (< k 0i)) {
      let ec = GLOBAL_executionStack[k]
      if (! (= ec.ScriptOrModule null)) return ec.ScriptOrModule
      else k = (- k 1i)
    }
    return null
  }"""), this)
}
