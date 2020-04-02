package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSymbolDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.Symbol.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisSymbolValue this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let sym = __x0__
    app __x1__ = (SymbolDescriptiveString sym)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}