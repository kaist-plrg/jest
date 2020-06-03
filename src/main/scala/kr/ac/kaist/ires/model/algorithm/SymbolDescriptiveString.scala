package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SymbolDescriptiveString {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""SymbolDescriptiveString" (sym) => {
    app __x0__ = (Type sym)
    assert (= __x0__ Symbol)
    let desc = sym["Description"]
    if (= desc undefined) desc = "" else {}
    app __x1__ = (Type desc)
    assert (= __x1__ String)
    app __x2__ = (WrapCompletion (+ (+ "Symbol(" desc) ")"))
    return __x2__
  }""")
}
