package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""Elision"""), Id("""AssignmentElement"""), Id("""iteratorRecord""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation1" (this, Elision, AssignmentElement, iteratorRecord) => {
    access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (AssignmentElement "IteratorDestructuringAssignmentEvaluation")
    app __x3__ = (__x2__ iteratorRecord)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
