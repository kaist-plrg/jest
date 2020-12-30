package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingElementList1ContainsExpression0 extends Algorithm {
  val name: String = "BindingElementList1ContainsExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElementList1ContainsExpression0" (this, BindingElementList, BindingElisionElement) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElisionElement "ContainsExpression")
    return __x1__
  }"""), this)
}
