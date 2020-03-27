package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement2LabelledEvaluation7 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement2LabelledEvaluation7""", List(Id("""this"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Expression2"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Expression0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression0"""))), EStr("""Evaluation""")), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""ForBodyEvaluation"""))), List(ERef(RefId(Id("""Expression1"""))), ERef(RefId(Id("""Expression2"""))), ERef(RefId(Id("""Statement"""))), EList(List()), ERef(RefId(Id("""labelSet"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "IterationStatement2LabelledEvaluation7" (this, Expression0, Expression1, Expression2, Statement, labelSet) => {
    if (! (= Expression0 absent)) {
      access __x0__ = (Expression0 "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    app __x2__ = (ForBodyEvaluation Expression1 Expression2 Statement (new []) labelSet)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
