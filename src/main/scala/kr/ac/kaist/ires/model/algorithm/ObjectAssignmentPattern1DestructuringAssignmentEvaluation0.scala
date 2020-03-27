package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectAssignmentPattern1DestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectAssignmentPattern1DestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentRestProperty"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x0__""")))), ILet(Id("""excludedNames"""), EList(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentRestProperty"""))), EStr("""RestDestructuringAssignmentEvaluation""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""excludedNames"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "ObjectAssignmentPattern1DestructuringAssignmentEvaluation0" (this, AssignmentRestProperty, value) => {
    app __x0__ = (RequireObjectCoercible value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let excludedNames = (new [])
    access __x1__ = (AssignmentRestProperty "RestDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value excludedNames)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
