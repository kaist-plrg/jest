package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingPropertyList1ContainsExpression0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""BindingPropertyList1ContainsExpression0" (this, BindingPropertyList, BindingProperty) => {
    access __x0__ = (BindingPropertyList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingProperty "ContainsExpression")
    return __x1__
  }""")
}
