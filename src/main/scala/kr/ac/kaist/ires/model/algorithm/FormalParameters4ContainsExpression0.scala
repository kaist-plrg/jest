package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters4ContainsExpression0 {
  val length: Int = 0
  val func: Func = parseFunc(""""FormalParameters4ContainsExpression0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FunctionRestParameter "ContainsExpression")
    return __x1__
  }""")
}
