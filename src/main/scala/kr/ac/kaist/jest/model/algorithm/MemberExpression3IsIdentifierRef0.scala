package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MemberExpression3IsIdentifierRef0 extends Algorithm {
  val name: String = "MemberExpression3IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression3IsIdentifierRef0" (this, MemberExpression, TemplateLiteral) => return false"""), this)
}
