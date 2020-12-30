package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingIdentifier0BoundNames0 extends Algorithm {
  val name: String = "BindingIdentifier0BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingIdentifier0BoundNames0" (this, Identifier) => {
    access __x0__ = (Identifier "StringValue")
    return (new [__x0__])
  }"""), this)
}
