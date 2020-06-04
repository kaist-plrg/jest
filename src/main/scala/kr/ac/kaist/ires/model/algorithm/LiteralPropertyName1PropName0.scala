package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName1PropName0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""LiteralPropertyName1PropName0" (this, StringLiteral) => {
    access __x0__ = (StringLiteral "SV")
    return __x0__
  }""")
}
