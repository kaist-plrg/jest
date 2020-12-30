package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateMiddleList0TemplateStrings0 extends Algorithm {
  val name: String = "TemplateMiddleList0TemplateStrings0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateMiddleList0TemplateStrings0" (this, TemplateMiddle, Expression, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateMiddle "TV")
      let string = __x0__
    } else {
      access __x1__ = (TemplateMiddle "TRV")
      let string = __x1__
    }
    return (new [string])
  }"""), this)
}
