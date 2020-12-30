package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectBindingPattern3BoundNames0 extends Algorithm {
  val name: String = "ObjectBindingPattern3BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectBindingPattern3BoundNames0" (this, BindingPropertyList) => {
    access __x0__ = (BindingPropertyList "BoundNames")
    return __x0__
  }"""), this)
}
