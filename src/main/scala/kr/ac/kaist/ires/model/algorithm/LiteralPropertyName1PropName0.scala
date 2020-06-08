package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName1PropName0 extends Algorithm {
  val name: String = "LiteralPropertyName1PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LiteralPropertyName1PropName0" (this, StringLiteral) => return !!! "StringOp""""), this)
}
