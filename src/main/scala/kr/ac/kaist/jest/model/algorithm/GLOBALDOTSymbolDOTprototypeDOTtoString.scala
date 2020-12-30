package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTSymbolDOTprototypeDOTtoString extends Algorithm {
  val name: String = "GLOBALDOTSymbolDOTprototypeDOTtoString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Symbol.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisSymbolValue this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let sym = __x0__
    app __x1__ = (SymbolDescriptiveString sym)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
