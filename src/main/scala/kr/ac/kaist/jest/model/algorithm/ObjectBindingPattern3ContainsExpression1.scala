package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectBindingPattern3ContainsExpression1 extends Algorithm {
  val name: String = "ObjectBindingPattern3ContainsExpression1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectBindingPattern3ContainsExpression1" (this, BindingPropertyList, BindingRestProperty) => {
    access __x0__ = (BindingPropertyList "ContainsExpression")
    return __x0__
  }"""), this)
}
