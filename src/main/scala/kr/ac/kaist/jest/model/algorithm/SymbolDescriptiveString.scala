package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SymbolDescriptiveString extends Algorithm {
  val name: String = "SymbolDescriptiveString"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""SymbolDescriptiveString" (sym) => {
    app __x0__ = (Type sym)
    assert (= __x0__ Symbol)
    let desc = sym["Description"]
    if (= desc undefined) desc = "" else {}
    app __x1__ = (Type desc)
    assert (= __x1__ String)
    app __x2__ = (WrapCompletion (+ (+ "Symbol(" desc) ")"))
    return __x2__
  }"""), this)
}
