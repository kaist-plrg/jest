package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakStatement1ContainsUndefinedBreakTarget0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BreakStatement1ContainsUndefinedBreakTarget0" (this, LabelIdentifier, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    if (! (contains labelSet __x0__)) return true else {}
    return false
  }"""))
}
