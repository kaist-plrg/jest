package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalBinding0BoundNames1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""LexicalBinding0BoundNames1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }""")
}
