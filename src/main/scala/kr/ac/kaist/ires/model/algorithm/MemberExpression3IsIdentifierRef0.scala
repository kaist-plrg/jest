package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression3IsIdentifierRef0 extends Algorithm {
  val name: String = "MemberExpression3IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression3IsIdentifierRef0" (this, MemberExpression, TemplateLiteral) => return false"""), this)
}
