package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList0SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList0SubstitutionEvaluation0""", List(Id("""this"""), Id("""TemplateMiddle"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""subRef"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""subRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""sub"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""sub"""))))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "TemplateMiddleList0SubstitutionEvaluation0" (this, TemplateMiddle, Expression) => {
    access __x0__ = (Expression "Evaluation")
    let subRef = __x0__
    app __x1__ = (GetValue subRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let sub = __x1__
    app __x2__ = (WrapCompletion (new [sub]))
    return __x2__
  }
  */
}
