package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction0HasName0 extends Algorithm {
  val name: String = "AsyncArrowFunction0HasName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncArrowFunction0HasName0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody) => return false"""), this)
}
