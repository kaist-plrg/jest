package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SubstitutionTemplate0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SubstitutionTemplate0Evaluation0""", List(Id("""this"""), Id("""TemplateHead"""), Id("""Expression"""), Id("""TemplateSpans""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TV""")), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""subRef"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""subRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""sub"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sub"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""middle"""), ERef(RefId(Id("""__x3__""")))), IAccess(Id("""__x4__"""), ERef(RefId(Id("""TemplateSpans"""))), EStr("""Evaluation""")), ILet(Id("""tail"""), ERef(RefId(Id("""__x4__""")))), IIf(EIsCompletion(ERef(RefId(Id("""tail""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""tail""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""tail""")), ERef(RefProp(RefId(Id("""tail""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""tail"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""tail""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""head"""))), ERef(RefId(Id("""middle""")))), ERef(RefId(Id("""tail""")))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "SubstitutionTemplate0Evaluation0" (this, TemplateHead, Expression, TemplateSpans) => {
    access __x0__ = (TemplateHead "TV")
    let head = __x0__
    access __x1__ = (Expression "Evaluation")
    let subRef = __x1__
    app __x2__ = (GetValue subRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let sub = __x2__
    app __x3__ = (ToString sub)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let middle = __x3__
    access __x4__ = (TemplateSpans "Evaluation")
    let tail = __x4__
    if (is-completion tail) if (= tail["Type"] CONST_normal) tail = tail["Value"] else return tail else {}
    tail
    app __x5__ = (WrapCompletion (+ (+ head middle) tail))
    return __x5__
  }
  */
}
