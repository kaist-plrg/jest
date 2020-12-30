package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SubstitutionTemplate0TemplateStrings0 extends Algorithm {
  val name: String = "SubstitutionTemplate0TemplateStrings0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SubstitutionTemplate0TemplateStrings0" (this, TemplateHead, Expression, TemplateSpans, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateHead "TV")
      let head = __x0__
    } else {
      access __x1__ = (TemplateHead "TRV")
      let head = __x1__
    }
    access __x2__ = (TemplateSpans "TemplateStrings")
    app __x3__ = (__x2__ raw)
    let tail = __x3__
    prepend head -> tail
    return tail
  }"""), this)
}
