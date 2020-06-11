package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement4ContainsDuplicateLabels3 extends Algorithm {
  val name: String = "IterationStatement4ContainsDuplicateLabels3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement4ContainsDuplicateLabels3" (this, LexicalDeclaration, Expression0, Expression1, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }"""), this)
}