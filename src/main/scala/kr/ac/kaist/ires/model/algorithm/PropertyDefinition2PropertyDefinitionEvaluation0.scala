package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition2PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition2PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""AssignmentExpression"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsCompletion(ERef(RefId(Id("""propKey""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""propKey"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""propKey""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""AssignmentExpression"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""NamedEvaluation""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""propKey"""))))), ILet(Id("""propValue"""), ERef(RefId(Id("""__x3__""")))))), ISeq(List(IAccess(Id("""__x4__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")), ILet(Id("""exprValueRef"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprValueRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""propValue"""), ERef(RefId(Id("""__x5__"""))))))), IAssert(EBOp(OEq, ERef(RefId(Id("""enumerable"""))), EBool(true))), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""propKey"""))), ERef(RefId(Id("""propValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "PropertyDefinition2PropertyDefinitionEvaluation0" (this, PropertyName, AssignmentExpression, object, enumerable) => {
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
  }
  */
}
