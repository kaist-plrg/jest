package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingProperty1ContainsExpression0 {
  val length: Int = 0
  val func: Func = parseFunc(""""BindingProperty1ContainsExpression0" (this, PropertyName, BindingElement) => {
    access __x0__ = (PropertyName "IsComputedPropertyKey")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElement "ContainsExpression")
    return __x1__
  }""")
}
