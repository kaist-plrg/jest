package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement2ContainsDuplicateLabels7 extends Algorithm {
  val name: String = "IterationStatement2ContainsDuplicateLabels7"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement2ContainsDuplicateLabels7" (this, Expression0, Expression1, Expression2, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }"""), this)
}