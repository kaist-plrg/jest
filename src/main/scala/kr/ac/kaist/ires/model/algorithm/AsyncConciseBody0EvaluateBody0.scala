package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncConciseBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""AsyncConciseBody0EvaluateBody0""", List(Id("""this"""), Id("""AssignmentExpression"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))), ILet(Id("""declResult"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""declResult"""))))), IIf(EUOp(ONot, ERef(RefId(Id("""__x2__""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncFunctionStart"""))), List(ERef(RefId(Id("""promiseCapability"""))), ERef(RefId(Id("""AssignmentExpression"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x3__""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""declResult""")), EStr("""Value"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x4__"""))))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "AsyncConciseBody0EvaluateBody0" (this, AssignmentExpression, functionObject, argumentsList) => {
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    let declResult = __x1__
    app __x2__ = (IsAbruptCompletion declResult)
    if (! __x2__) {
      app __x3__ = (AsyncFunctionStart promiseCapability AssignmentExpression)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [declResult["Value"]]))
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
    }
    app __x5__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> promiseCapability["Promise"], "Target" -> CONST_empty)))
    return __x5__
  }
  */
}
