package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionExpression0HasName0 extends Algorithm {
  val name: String = "FunctionExpression0HasName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionExpression0HasName0" (this, FormalParameters, FunctionBody) => return false"""), this)
}
