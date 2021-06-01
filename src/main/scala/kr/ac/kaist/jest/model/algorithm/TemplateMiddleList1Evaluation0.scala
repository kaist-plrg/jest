package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateMiddleList1Evaluation0 extends Algorithm {
  val name: String = "TemplateMiddleList1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateMiddleList1Evaluation0" (this, TemplateMiddleList, TemplateMiddle, Expression) => {
    access __x0__ = (TemplateMiddleList "Evaluation")
    let rest = __x0__
    if (is-completion rest) if (= rest["Type"] CONST_normal) rest = rest["Value"] else return rest else {}
    rest
    access __x1__ = (TemplateMiddle "TV")
    let middle = __x1__
    access __x2__ = (Expression "Evaluation")
    let subRef = __x2__
    app __x3__ = (GetValue subRef)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let sub = __x3__
    app __x4__ = (ToString sub)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let last = __x4__
    app __x5__ = (WrapCompletion (+ (+ rest middle) last))
    return __x5__
  }"""), this)
}
