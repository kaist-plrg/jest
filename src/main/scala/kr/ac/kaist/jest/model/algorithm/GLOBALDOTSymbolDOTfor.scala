package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTSymbolDOTfor extends Algorithm {
  val name: String = "GLOBALDOTSymbolDOTfor"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Symbol.for" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (ToString key)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let stringKey = __x1__
    let idx = 0i
    let len = GLOBAL_GlobalSymbolRegistry.length
    while (< idx len) {
      let e = GLOBAL_GlobalSymbolRegistry[idx]
      app cond = (SameValue e.Key stringKey)
      if (= cond true) return e.Symbol
      else idx = (+ idx 1i)
    }
    let newSymbol = (new 'stringKey)
    append (new GlobalSymbolRegistryRecord ("Key" -> stringKey, "Symbol" -> newSymbol)) -> GLOBAL_GlobalSymbolRegistry
    app __x2__ = (WrapCompletion newSymbol)
    return __x2__
  }"""), this)
}
