package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingPropertyList1ContainsExpression0 extends Algorithm {
  val name: String = "BindingPropertyList1ContainsExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingPropertyList1ContainsExpression0" (this, BindingPropertyList, BindingProperty) => {
    access __x0__ = (BindingPropertyList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingProperty "ContainsExpression")
    return __x1__
  }"""), this)
}
