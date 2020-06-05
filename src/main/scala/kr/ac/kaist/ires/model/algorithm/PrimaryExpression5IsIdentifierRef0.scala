package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression5IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression5IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression5IsIdentifierRef0" (this, FunctionExpression) => return false"""), this)
}
