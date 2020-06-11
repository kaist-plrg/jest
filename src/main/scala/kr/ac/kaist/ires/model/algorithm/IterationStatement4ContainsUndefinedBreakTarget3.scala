package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement4ContainsUndefinedBreakTarget3 extends Algorithm {
  val name: String = "IterationStatement4ContainsUndefinedBreakTarget3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement4ContainsUndefinedBreakTarget3" (this, LexicalDeclaration, Expression0, Expression1, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }"""), this)
}