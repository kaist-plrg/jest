package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateMiddleList0SubstitutionEvaluation0 extends Algorithm {
  val name: String = "TemplateMiddleList0SubstitutionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateMiddleList0SubstitutionEvaluation0" (this, TemplateMiddle, Expression) => {
    access __x0__ = (Expression "Evaluation")
    let subRef = __x0__
    app __x1__ = (GetValue subRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let sub = __x1__
    app __x2__ = (WrapCompletion (new [sub]))
    return __x2__
  }"""), this)
}
