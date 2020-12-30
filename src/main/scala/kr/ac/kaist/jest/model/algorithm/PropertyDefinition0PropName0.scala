package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyDefinition0PropName0 extends Algorithm {
  val name: String = "PropertyDefinition0PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinition0PropName0" (this, IdentifierReference) => {
    access __x0__ = (IdentifierReference "StringValue")
    return __x0__
  }"""), this)
}
