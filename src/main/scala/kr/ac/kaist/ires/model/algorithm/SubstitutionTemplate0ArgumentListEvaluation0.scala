package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SubstitutionTemplate0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""SubstitutionTemplate0ArgumentListEvaluation0""", List(Id("""this"""), Id("""TemplateHead"""), Id("""Expression"""), Id("""TemplateSpans""")), None, ISeq(List(ILet(Id("""templateLiteral"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetTemplateObject"""))), List(ERef(RefId(Id("""templateLiteral"""))))), ILet(Id("""siteObj"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""firstSubRef"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""firstSubRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""firstSub"""), ERef(RefId(Id("""__x2__""")))), IAccess(Id("""__x3__"""), ERef(RefId(Id("""TemplateSpans"""))), EStr("""SubstitutionEvaluation""")), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""restSub"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""__x4__"""), ECopy(ERef(RefId(Id("""restSub"""))))), IPrepend(ERef(RefId(Id("""firstSub"""))), ERef(RefId(Id("""__x4__""")))), IPrepend(ERef(RefId(Id("""siteObj"""))), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "SubstitutionTemplate0ArgumentListEvaluation0" (this, TemplateHead, Expression, TemplateSpans) => {
    let templateLiteral = this
    app __x0__ = (GetTemplateObject templateLiteral)
    let siteObj = __x0__
    access __x1__ = (Expression "Evaluation")
    let firstSubRef = __x1__
    app __x2__ = (GetValue firstSubRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let firstSub = __x2__
    access __x3__ = (TemplateSpans "SubstitutionEvaluation")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let restSub = __x3__
    let __x4__ = (copy-obj restSub)
    prepend firstSub -> __x4__
    prepend siteObj -> __x4__
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
