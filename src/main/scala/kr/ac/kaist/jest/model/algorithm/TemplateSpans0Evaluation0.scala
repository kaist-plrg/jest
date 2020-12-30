package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateSpans0Evaluation0 extends Algorithm {
  val name: String = "TemplateSpans0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateSpans0Evaluation0" (this, TemplateTail) => {
    access __x0__ = (TemplateTail "TV")
    let tail = __x0__
    app __x1__ = (WrapCompletion tail)
    return __x1__
  }"""), this)
}
