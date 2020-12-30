package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression0IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression0IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression0IsIdentifierRef0" (this) => return false"""), this)
}
