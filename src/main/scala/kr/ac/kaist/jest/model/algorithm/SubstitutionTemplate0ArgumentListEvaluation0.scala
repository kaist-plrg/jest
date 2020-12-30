package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SubstitutionTemplate0ArgumentListEvaluation0 extends Algorithm {
  val name: String = "SubstitutionTemplate0ArgumentListEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SubstitutionTemplate0ArgumentListEvaluation0" (this, TemplateHead, Expression, TemplateSpans) => {
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
  }"""), this)
}
