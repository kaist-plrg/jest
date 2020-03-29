package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinitionList1PropertyNameList0 {
  val length: Int = 0
  val func: Func = parseFunc(""""PropertyDefinitionList1PropertyNameList0" (this, PropertyDefinitionList, PropertyDefinition) => {
    access __x0__ = (PropertyDefinitionList "PropertyNameList")
    let list = __x0__
    access __x1__ = (PropertyDefinition "PropName")
    if (= __x1__ CONST_empty) return list else {}
    access __x2__ = (PropertyDefinition "PropName")
    append __x2__ -> list
    return list
  }""")
}
