package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList0TemplateStrings0 extends Algorithm {
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
  }"""))
}
