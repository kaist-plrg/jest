package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LeftHandSideExpression1IsIdentifierRef0 extends Algorithm {
  val name: String = "LeftHandSideExpression1IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LeftHandSideExpression1IsIdentifierRef0" (this, CallExpression) => return false"""), this)
}
