package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTgetSymbolDOTprototypeDOTdescription extends Algorithm {
  val name: String = "GLOBALDOTgetSymbolDOTprototypeDOTdescription"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.getSymbol.prototype.description" (this, argumentsList, NewTarget) => {
    let s = this
    app __x0__ = (thisSymbolValue s)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let sym = __x0__
    app __x1__ = (WrapCompletion sym["Description"])
    return __x1__
  }"""), this)
}
