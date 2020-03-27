package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans1Evaluation0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""Evaluation""")), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsCompletion(ERef(RefId(Id("""head""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""head""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""head""")), ERef(RefProp(RefId(Id("""head""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""head"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""head""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")), ILet(Id("""tail"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""head"""))), ERef(RefId(Id("""tail""")))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "TemplateSpans1Evaluation0" (this, TemplateMiddleList, TemplateTail) => {
    access __x0__ = (TemplateMiddleList "Evaluation")
    let head = __x0__
    if (is-completion head) if (= head["Type"] CONST_normal) head = head["Value"] else return head else {}
    head
    access __x1__ = (TemplateTail "TV")
    let tail = __x1__
    app __x2__ = (WrapCompletion (+ head tail))
    return __x2__
  }
  */
}
