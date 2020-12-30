package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateSpans1Evaluation0 extends Algorithm {
  val name: String = "TemplateSpans1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateSpans1Evaluation0" (this, TemplateMiddleList, TemplateTail) => {
    access __x0__ = (TemplateMiddleList "Evaluation")
    let head = __x0__
    if (is-completion head) if (= head["Type"] CONST_normal) head = head["Value"] else return head else {}
    head
    access __x1__ = (TemplateTail "TV")
    let tail = __x1__
    app __x2__ = (WrapCompletion (+ head tail))
    return __x2__
  }"""), this)
}
