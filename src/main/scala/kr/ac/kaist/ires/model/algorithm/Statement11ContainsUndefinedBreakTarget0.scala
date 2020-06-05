package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement11ContainsUndefinedBreakTarget0 extends Algorithm {
  val name: String = "Statement11ContainsUndefinedBreakTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement11ContainsUndefinedBreakTarget0" (this, ThrowStatement, labelSet) => return false"""), this)
}
