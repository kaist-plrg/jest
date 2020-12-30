package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MethodDefinition0ComputedPropertyContains0 extends Algorithm {
  val name: String = "MethodDefinition0ComputedPropertyContains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition0ComputedPropertyContains0" (this, PropertyName, UniqueFormalParameters, FunctionBody, symbol) => {
    access __x0__ = (PropertyName "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }"""), this)
}
