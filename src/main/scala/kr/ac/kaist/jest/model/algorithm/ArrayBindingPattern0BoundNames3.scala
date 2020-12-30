package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayBindingPattern0BoundNames3 extends Algorithm {
  val name: String = "ArrayBindingPattern0BoundNames3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern0BoundNames3" (this, Elision, BindingRestElement) => {
    access __x0__ = (BindingRestElement "BoundNames")
    return __x0__
  }"""), this)
}
