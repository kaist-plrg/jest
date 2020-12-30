package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingProperty1BoundNames0 extends Algorithm {
  val name: String = "BindingProperty1BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingProperty1BoundNames0" (this, PropertyName, BindingElement) => {
    access __x0__ = (BindingElement "BoundNames")
    return __x0__
  }"""), this)
}
