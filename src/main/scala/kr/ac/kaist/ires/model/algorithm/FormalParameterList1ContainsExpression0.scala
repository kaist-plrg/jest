package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1ContainsExpression0 {
  val length: Int = 0
  val func: Func = parseFunc(""""FormalParameterList1ContainsExpression0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FormalParameter "ContainsExpression")
    return __x1__
  }""")
}