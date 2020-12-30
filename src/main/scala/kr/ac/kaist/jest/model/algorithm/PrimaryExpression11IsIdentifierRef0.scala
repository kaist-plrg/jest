package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression11IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression11IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression11IsIdentifierRef0" (this, TemplateLiteral) => return false"""), this)
}
