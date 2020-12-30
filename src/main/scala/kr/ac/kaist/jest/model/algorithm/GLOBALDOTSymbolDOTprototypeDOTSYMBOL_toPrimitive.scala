package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTSymbolDOTprototypeDOTSYMBOL_toPrimitive extends Algorithm {
  val name: String = "GLOBALDOTSymbolDOTprototypeDOTSYMBOL_toPrimitive"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Symbol.prototype.SYMBOL_toPrimitive" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let hint = __x0__
    app __x1__ = (thisSymbolValue this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
