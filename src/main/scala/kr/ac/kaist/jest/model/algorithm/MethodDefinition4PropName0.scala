package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MethodDefinition4PropName0 extends Algorithm {
  val name: String = "MethodDefinition4PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition4PropName0" (this, PropertyName, FunctionBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }"""), this)
}
