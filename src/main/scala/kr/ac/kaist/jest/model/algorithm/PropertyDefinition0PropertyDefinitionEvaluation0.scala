package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyDefinition0PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "PropertyDefinition0PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyDefinition0PropertyDefinitionEvaluation0" (this, IdentifierReference, object, enumerable) => {
    access __x0__ = (IdentifierReference "StringValue")
    let propName = __x0__
    access __x1__ = (IdentifierReference "Evaluation")
    let exprValue = __x1__
    app __x2__ = (GetValue exprValue)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let propValue = __x2__
    assert (= enumerable true)
    app __x3__ = (CreateDataPropertyOrThrow object propName propValue)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
