package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CallExpression5Contains0 extends Algorithm {
  val name: String = "CallExpression5Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression5Contains0" (this, CallExpression, IdentifierName, symbol) => {
    access __x0__ = (CallExpression "Contains")
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
