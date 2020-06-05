package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyName0IsComputedPropertyKey0 extends Algorithm {
  val name: String = "PropertyName0IsComputedPropertyKey0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyName0IsComputedPropertyKey0" (this, LiteralPropertyName) => return false"""), this)
}
