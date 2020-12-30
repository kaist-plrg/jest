package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingElisionElement0ContainsExpression1 extends Algorithm {
  val name: String = "BindingElisionElement0ContainsExpression1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElisionElement0ContainsExpression1" (this, Elision, BindingElement) => {
    access __x0__ = (BindingElement "ContainsExpression")
    return __x0__
  }"""), this)
}
