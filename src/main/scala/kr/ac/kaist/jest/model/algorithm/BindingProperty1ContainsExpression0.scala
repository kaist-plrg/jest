package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingProperty1ContainsExpression0 extends Algorithm {
  val name: String = "BindingProperty1ContainsExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingProperty1ContainsExpression0" (this, PropertyName, BindingElement) => {
    access __x0__ = (PropertyName "IsComputedPropertyKey")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElement "ContainsExpression")
    return __x1__
  }"""), this)
}
