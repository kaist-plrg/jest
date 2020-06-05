package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern0ContainsExpression3 extends Algorithm {
  val name: String = "ArrayBindingPattern0ContainsExpression3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern0ContainsExpression3" (this, Elision, BindingRestElement) => {
    access __x0__ = (BindingRestElement "ContainsExpression")
    return __x0__
  }"""), this)
}
