package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayBindingPattern2ContainsExpression2 extends Algorithm {
  val name: String = "ArrayBindingPattern2ContainsExpression2"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern2ContainsExpression2" (this, BindingElementList, Elision) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    return __x0__
  }"""), this)
}
