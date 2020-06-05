package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingRestElement1ContainsExpression0 extends Algorithm {
  val name: String = "BindingRestElement1ContainsExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingRestElement1ContainsExpression0" (this, BindingPattern) => {
    access __x0__ = (BindingPattern "ContainsExpression")
    return __x0__
  }"""), this)
}
