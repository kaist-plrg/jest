package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyDefinitionList1PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "PropertyDefinitionList1PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinitionList1PropertyDefinitionEvaluation0" (this, PropertyDefinitionList, PropertyDefinition, object, enumerable) => {
    access __x0__ = (PropertyDefinitionList "PropertyDefinitionEvaluation")
    app __x1__ = (__x0__ object enumerable)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (PropertyDefinition "PropertyDefinitionEvaluation")
    app __x3__ = (__x2__ object enumerable)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
