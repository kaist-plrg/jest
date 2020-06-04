package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern2BoundNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern2BoundNames0" (this, BindingElementList) => {
    access __x0__ = (BindingElementList "BoundNames")
    return __x0__
  }"""))
}
