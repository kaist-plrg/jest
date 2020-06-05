package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyName0ComputedPropertyContains0 extends Algorithm {
  val name: String = "PropertyName0ComputedPropertyContains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyName0ComputedPropertyContains0" (this, LiteralPropertyName, symbol) => return false"""), this)
}
