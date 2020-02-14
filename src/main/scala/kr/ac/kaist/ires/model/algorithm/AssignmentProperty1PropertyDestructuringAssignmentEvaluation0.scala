package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentProperty1PropertyDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentProperty1PropertyDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""AssignmentElement"""), Id("""value""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""name""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""name""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""name""")), ERef(RefProp(RefId(Id("""name""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""name"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""name""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentElement"""))), EStr("""KeyedDestructuringAssignmentEvaluation""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""name"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""name"""))))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "AssignmentProperty1PropertyDestructuringAssignmentEvaluation0" (this, PropertyName, AssignmentElement, value) => {
    access __x0__ = (PropertyName "Evaluation")
    let name = __x0__
    if (= (typeof name) "Completion") if (= name["Type"] CONST_normal) name = name["Value"] else return name else {}
    name
    access __x1__ = (AssignmentElement "KeyedDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value name)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion (new [name]))
    return __x3__
  }
  */
}
