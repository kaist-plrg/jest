package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FormalParameters4ContainsExpression0 extends Algorithm {
  val name: String = "FormalParameters4ContainsExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameters4ContainsExpression0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FunctionRestParameter "ContainsExpression")
    return __x1__
  }"""), this)
}
