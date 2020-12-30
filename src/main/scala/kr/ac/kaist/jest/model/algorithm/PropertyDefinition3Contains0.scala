package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyDefinition3Contains0 extends Algorithm {
  val name: String = "PropertyDefinition3Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinition3Contains0" (this, MethodDefinition, symbol) => {
    if (is-instance-of symbol MethodDefinition) return true else {}
    access __x0__ = (MethodDefinition "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }"""), this)
}
