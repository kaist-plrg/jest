package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalBinding1BoundNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""LexicalBinding1BoundNames0" (this, BindingPattern, Initializer) => {
    access __x0__ = (BindingPattern "BoundNames")
    return __x0__
  }""")
}
