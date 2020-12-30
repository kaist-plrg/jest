package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression3IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression3IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression3IsIdentifierRef0" (this, ArrayLiteral) => return false"""), this)
}
