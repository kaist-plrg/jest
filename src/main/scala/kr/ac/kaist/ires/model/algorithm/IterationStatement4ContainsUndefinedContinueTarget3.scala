package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement4ContainsUndefinedContinueTarget3 extends Algorithm {
  val name: String = "IterationStatement4ContainsUndefinedContinueTarget3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement4ContainsUndefinedContinueTarget3" (this, LexicalDeclaration, Expression0, Expression1, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }"""), this)
}