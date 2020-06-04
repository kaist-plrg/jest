package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinitionList0PropertyNameList0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinitionList0PropertyNameList0" (this, PropertyDefinition) => {
    access __x0__ = (PropertyDefinition "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (PropertyDefinition "PropName")
    return (new [__x1__])
  }"""))
}
