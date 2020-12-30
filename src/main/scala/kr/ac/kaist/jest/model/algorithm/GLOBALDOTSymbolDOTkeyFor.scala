package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTSymbolDOTkeyFor extends Algorithm {
  val name: String = "GLOBALDOTSymbolDOTkeyFor"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Symbol.keyFor" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let sym = __x0__
    app __x1__ = (Type sym)
    if (! (= __x1__ Symbol)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let idx = 0i
    let len = GLOBAL_GlobalSymbolRegistry.length
    while (< idx len) {
      let e = GLOBAL_GlobalSymbolRegistry[idx]
      app cond = (SameValue e.Symbol sym)
      if (= cond true) return e.Key
      else idx = (+ idx 1i)
    }
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }"""), this)
}
