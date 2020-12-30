package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateSpans1SubstitutionEvaluation0 extends Algorithm {
  val name: String = "TemplateSpans1SubstitutionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateSpans1SubstitutionEvaluation0" (this, TemplateMiddleList, TemplateTail) => {
    access __x0__ = (TemplateMiddleList "SubstitutionEvaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
