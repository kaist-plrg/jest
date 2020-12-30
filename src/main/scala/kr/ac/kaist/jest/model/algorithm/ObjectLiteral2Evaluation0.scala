package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectLiteral2Evaluation0 extends Algorithm {
  val name: String = "ObjectLiteral2Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectLiteral2Evaluation0" (this, PropertyDefinitionList) => {
    app obj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    access __x0__ = (PropertyDefinitionList "PropertyDefinitionEvaluation")
    app __x1__ = (__x0__ obj true)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion obj)
    return __x2__
  }"""), this)
}
