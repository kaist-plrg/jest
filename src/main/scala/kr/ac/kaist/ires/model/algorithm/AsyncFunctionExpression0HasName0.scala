package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionExpression0HasName0 extends Algorithm {
  val name: String = "AsyncFunctionExpression0HasName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionExpression0HasName0" (this, FormalParameters, AsyncFunctionBody) => return false"""), this)
}
