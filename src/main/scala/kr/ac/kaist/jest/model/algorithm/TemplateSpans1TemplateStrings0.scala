package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateSpans1TemplateStrings0 extends Algorithm {
  val name: String = "TemplateSpans1TemplateStrings0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateSpans1TemplateStrings0" (this, TemplateMiddleList, TemplateTail, raw) => {
    access __x0__ = (TemplateMiddleList "TemplateStrings")
    app __x1__ = (__x0__ raw)
    let middle = __x1__
    if (= raw false) {
      access __x2__ = (TemplateTail "TV")
      let tail = __x2__
    } else {
      access __x3__ = (TemplateTail "TRV")
      let tail = __x3__
    }
    let idx = 0i
    let len = tail.length
    while (< idx len) {
      append tail[idx] -> middle
      idx = (+ idx 1i)
    }
    return middle
  }"""), this)
}
