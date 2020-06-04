package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingIdentifier0BoundNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""BindingIdentifier0BoundNames0" (this, Identifier) => {
    access __x0__ = (Identifier "StringValue")
    return (new [__x0__])
  }""")
}
