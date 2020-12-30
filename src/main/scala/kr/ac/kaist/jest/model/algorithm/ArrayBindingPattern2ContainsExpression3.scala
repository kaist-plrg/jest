package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayBindingPattern2ContainsExpression3 extends Algorithm {
  val name: String = "ArrayBindingPattern2ContainsExpression3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern2ContainsExpression3" (this, BindingElementList, Elision, BindingRestElement) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingRestElement "ContainsExpression")
    return __x1__
  }"""), this)
}
