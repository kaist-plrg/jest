package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MethodDefinition4ComputedPropertyContains0 extends Algorithm {
  val name: String = "MethodDefinition4ComputedPropertyContains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition4ComputedPropertyContains0" (this, PropertyName, FunctionBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }"""), this)
}
