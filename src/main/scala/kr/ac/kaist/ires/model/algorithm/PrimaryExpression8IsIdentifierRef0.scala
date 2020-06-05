package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression8IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression8IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression8IsIdentifierRef0" (this, AsyncFunctionExpression) => return false"""), this)
}
