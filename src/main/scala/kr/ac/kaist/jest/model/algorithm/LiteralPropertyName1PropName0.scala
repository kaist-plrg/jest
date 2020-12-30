package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LiteralPropertyName1PropName0 extends Algorithm {
  val name: String = "LiteralPropertyName1PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LiteralPropertyName1PropName0" (this, StringLiteral) => {
    access result = (StringLiteral "SV")
    app wrapped = (WrapCompletion result)
    return wrapped
  }"""), this)
}
