package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression4IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression4IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression4IsIdentifierRef0" (this, ObjectLiteral) => return false"""), this)
}
