package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FormalParameterList1ContainsExpression0 extends Algorithm {
  val name: String = "FormalParameterList1ContainsExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameterList1ContainsExpression0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FormalParameter "ContainsExpression")
    return __x1__
  }"""), this)
}
