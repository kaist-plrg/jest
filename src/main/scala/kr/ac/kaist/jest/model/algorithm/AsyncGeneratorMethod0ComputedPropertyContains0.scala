package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncGeneratorMethod0ComputedPropertyContains0 extends Algorithm {
  val name: String = "AsyncGeneratorMethod0ComputedPropertyContains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorMethod0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }"""), this)
}
