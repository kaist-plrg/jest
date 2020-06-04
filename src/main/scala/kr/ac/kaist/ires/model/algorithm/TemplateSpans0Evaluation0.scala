package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""TemplateSpans0Evaluation0" (this, TemplateTail) => {
    access __x0__ = (TemplateTail "TV")
    let tail = __x0__
    app __x1__ = (WrapCompletion tail)
    return __x1__
  }""")
}
