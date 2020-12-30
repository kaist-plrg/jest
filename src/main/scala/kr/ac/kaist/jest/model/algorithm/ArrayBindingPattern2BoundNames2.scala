package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayBindingPattern2BoundNames2 extends Algorithm {
  val name: String = "ArrayBindingPattern2BoundNames2"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern2BoundNames2" (this, BindingElementList, Elision) => {
    access __x0__ = (BindingElementList "BoundNames")
    return __x0__
  }"""), this)
}
