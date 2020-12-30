package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingIdentifier2BoundNames0 extends Algorithm {
  val name: String = "BindingIdentifier2BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingIdentifier2BoundNames0" (this) => return (new ["await"])"""), this)
}
