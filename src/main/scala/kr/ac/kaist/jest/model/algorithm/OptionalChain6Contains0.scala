package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OptionalChain6Contains0 extends Algorithm {
  val name: String = "OptionalChain6Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OptionalChain6Contains0" (this, OptionalChain, IdentifierName, symbol) => {
    access __x0__ = (OptionalChain "Contains")
    app __x1__ = (__x0__ symbol)
    if (= __x1__ true) return true else {}
    if (is-instance-of symbol ReservedWord) return false else {}
    let __x2__ = (is-instance-of symbol Identifier)
    if __x2__ {
      access __x3__ = (symbol "StringValue")
      access __x4__ = (IdentifierName "StringValue")
      __x2__ = (= __x3__ __x4__)
    } else {}
    if __x2__ return true else {}
    return false
  }"""), this)
}
