package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName0PropName0 extends Algorithm {
  val name: String = "LiteralPropertyName0PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LiteralPropertyName0PropName0" (this, IdentifierName) => {
    access __x0__ = (IdentifierName "StringValue")
    return __x0__
  }"""), this)
}
