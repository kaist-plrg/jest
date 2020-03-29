package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSymbolDOTfor {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Symbol.for" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (ToString key)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let stringKey = __x1__
    !!! "Etc"
    let newSymbol = (new 'stringKey)
    !!! "Etc"
    app __x2__ = (WrapCompletion newSymbol)
    return __x2__
  }""")
}
