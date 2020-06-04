package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans0TemplateStrings0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateSpans0TemplateStrings0" (this, TemplateTail, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateTail "TV")
      let tail = __x0__
    } else {
      access __x1__ = (TemplateTail "TRV")
      let tail = __x1__
    }
    return (new [tail])
  }"""))
}
