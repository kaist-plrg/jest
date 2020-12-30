package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyName1ComputedPropertyContains0 extends Algorithm {
  val name: String = "PropertyName1ComputedPropertyContains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyName1ComputedPropertyContains0" (this, ComputedPropertyName, symbol) => {
    access __x0__ = (ComputedPropertyName "Contains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }"""), this)
}
