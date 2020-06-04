package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern2ContainsExpression3 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArrayBindingPattern2ContainsExpression3" (this, BindingElementList, Elision, BindingRestElement) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingRestElement "ContainsExpression")
    return __x1__
  }""")
}
