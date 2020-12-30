package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MemberExpression3IsFunctionDefinition0 extends Algorithm {
  val name: String = "MemberExpression3IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression3IsFunctionDefinition0" (this, MemberExpression, TemplateLiteral) => return false"""), this)
}
