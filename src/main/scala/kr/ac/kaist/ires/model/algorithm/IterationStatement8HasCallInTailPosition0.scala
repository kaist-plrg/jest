package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement8HasCallInTailPosition0 extends Algorithm {
  val name: String = "IterationStatement8HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement8HasCallInTailPosition0" (this, LeftHandSideExpression, AssignmentExpression, Statement, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}