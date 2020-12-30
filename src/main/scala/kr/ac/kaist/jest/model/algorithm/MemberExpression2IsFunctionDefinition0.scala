package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MemberExpression2IsFunctionDefinition0 extends Algorithm {
  val name: String = "MemberExpression2IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression2IsFunctionDefinition0" (this, MemberExpression, IdentifierName) => return false"""), this)
}
