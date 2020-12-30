package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.BUG_FIX
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyDefinition2PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "PropertyDefinition2PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(if (BUG_FIX) fixed else es11), this)
  private def es11 = """"PropertyDefinition2PropertyDefinitionEvaluation0" (this, PropertyName, AssignmentExpression, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    app __x1__ = (IsAnonymousFunctionDefinition AssignmentExpression)
    if (= __x1__ true) {
      access __x2__ = (AssignmentExpression "NamedEvaluation")
      app __x3__ = (__x2__ propKey)
      let propValue = __x3__
    } else {
      access __x4__ = (AssignmentExpression "Evaluation")
      let exprValueRef = __x4__
      app __x5__ = (GetValue exprValueRef)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let propValue = __x5__
    }
    assert (= enumerable true)
    app __x6__ = (CreateDataPropertyOrThrow object propKey propValue)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""
  private def fixed = """"PropertyDefinition2PropertyDefinitionEvaluation0" (this, PropertyName, AssignmentExpression, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    app __x1__ = (IsAnonymousFunctionDefinition AssignmentExpression)
    if (= __x1__ true) {
      access __x2__ = (AssignmentExpression "NamedEvaluation")
      app __x3__ = (__x2__ propKey)
      let propValue = __x3__
      ? propValue
    } else {
      access __x4__ = (AssignmentExpression "Evaluation")
      let exprValueRef = __x4__
      app __x5__ = (GetValue exprValueRef)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let propValue = __x5__
    }
    assert (= enumerable true)
    app __x6__ = (CreateDataPropertyOrThrow object propKey propValue)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""
}
