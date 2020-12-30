package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LiteralPropertyName0Contains0 extends Algorithm {
  val name: String = "LiteralPropertyName0Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LiteralPropertyName0Contains0" (this, IdentifierName, symbol) => {
    if (is-instance-of symbol ReservedWord) return false else {}
    let __x0__ = (is-instance-of symbol Identifier)
    if __x0__ {
      access __x1__ = (symbol "StringValue")
      access __x2__ = (IdentifierName "StringValue")
      __x0__ = (= __x1__ __x2__)
    } else {}
    if __x0__ return true else {}
    return false
  }"""), this)
}
