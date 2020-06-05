package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression5IsFunctionDefinition0 extends Algorithm {
  val name: String = "MemberExpression5IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression5IsFunctionDefinition0" (this, MetaProperty) => return false"""), this)
}
