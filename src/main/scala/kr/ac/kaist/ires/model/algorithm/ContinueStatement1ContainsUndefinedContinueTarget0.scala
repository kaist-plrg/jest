package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ContinueStatement1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ContinueStatement1ContainsUndefinedContinueTarget0" (this, LabelIdentifier, iterationSet, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    if (! (contains iterationSet __x0__)) return true else {}
    return false
  }""")
}
