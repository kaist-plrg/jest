package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionExpression1Contains0 extends Algorithm {
  val name: String = "AsyncFunctionExpression1Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionExpression1Contains0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody, symbol) => return false"""), this)
}
