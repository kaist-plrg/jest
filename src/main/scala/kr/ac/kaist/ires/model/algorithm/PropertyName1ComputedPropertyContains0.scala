package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyName1ComputedPropertyContains0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyName1ComputedPropertyContains0" (this, ComputedPropertyName, symbol) => {
    access __x0__ = (ComputedPropertyName "Contains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }"""))
}
