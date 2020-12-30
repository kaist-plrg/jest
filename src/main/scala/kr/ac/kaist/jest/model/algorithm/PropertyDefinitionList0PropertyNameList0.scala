package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyDefinitionList0PropertyNameList0 extends Algorithm {
  val name: String = "PropertyDefinitionList0PropertyNameList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinitionList0PropertyNameList0" (this, PropertyDefinition) => {
    access __x0__ = (PropertyDefinition "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (PropertyDefinition "PropName")
    return (new [__x1__])
  }"""), this)
}
