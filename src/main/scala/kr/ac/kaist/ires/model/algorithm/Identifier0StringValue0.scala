package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Identifier0StringValue0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""Identifier0StringValue0" (this, IdentifierName) => {
    access __x0__ = (IdentifierName "StringValue")
    return __x0__
  }""")
}
