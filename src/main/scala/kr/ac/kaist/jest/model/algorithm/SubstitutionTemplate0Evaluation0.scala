package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SubstitutionTemplate0Evaluation0 extends Algorithm {
  val name: String = "SubstitutionTemplate0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SubstitutionTemplate0Evaluation0" (this, TemplateHead, Expression, TemplateSpans) => {
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
  }"""), this)
}
