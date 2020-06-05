package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression7IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression7IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression7IsIdentifierRef0" (this, GeneratorExpression) => return false"""), this)
}
