package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object EvaluatePropertyAccessWithExpressionKey extends Algorithm {
  val name: String = "EvaluatePropertyAccessWithExpressionKey"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""EvaluatePropertyAccessWithExpressionKey" (baseValue, expression, strict) => {
    access __x0__ = (expression "Evaluation")
    let propertyNameReference = __x0__
    app __x1__ = (GetValue propertyNameReference)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let propertyNameValue = __x1__
    app __x2__ = (RequireObjectCoercible baseValue)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let bv = __x2__
    app __x3__ = (ToPropertyKey propertyNameValue)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let propertyKey = __x3__
    app __x4__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyKey, "StrictReference" -> strict)))
    return __x4__
  }"""), this)
}
