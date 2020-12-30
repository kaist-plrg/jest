package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyDefinitionList1PropertyNameList0 extends Algorithm {
  val name: String = "PropertyDefinitionList1PropertyNameList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinitionList1PropertyNameList0" (this, PropertyDefinitionList, PropertyDefinition) => {
    access __x0__ = (PropertyDefinitionList "PropertyNameList")
    let list = __x0__
    access __x1__ = (PropertyDefinition "PropName")
    if (= __x1__ CONST_empty) return list else {}
    access __x2__ = (PropertyDefinition "PropName")
    append __x2__ -> list
    return list
  }"""), this)
}
