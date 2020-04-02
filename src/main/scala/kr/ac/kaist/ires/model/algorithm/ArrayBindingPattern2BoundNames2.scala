package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern2BoundNames2 {
  val length: Int = 0
  val func: Func = parseFunc(""""ArrayBindingPattern2BoundNames2" (this, BindingElementList, Elision) => {
    access __x0__ = (BindingElementList "BoundNames")
    return __x0__
  }""")
}