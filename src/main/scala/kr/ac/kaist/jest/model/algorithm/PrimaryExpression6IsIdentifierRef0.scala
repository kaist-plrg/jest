package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression6IsIdentifierRef0 extends Algorithm {
  val name: String = "PrimaryExpression6IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression6IsIdentifierRef0" (this, ClassExpression) => return false"""), this)
}
