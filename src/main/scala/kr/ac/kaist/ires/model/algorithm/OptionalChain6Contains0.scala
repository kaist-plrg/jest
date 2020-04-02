package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OptionalChain6Contains0 {
  val length: Int = 0
  val func: Func = parseFunc(""""OptionalChain6Contains0" (this, OptionalChain, IdentifierName, symbol) => {
    access __x0__ = (OptionalChain "Contains")
    app __x1__ = (__x0__ symbol)
    if (= __x1__ true) return true else {}
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }""")
}
