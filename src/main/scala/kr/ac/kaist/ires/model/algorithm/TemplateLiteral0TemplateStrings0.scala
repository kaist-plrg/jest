package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateLiteral0TemplateStrings0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""TemplateLiteral0TemplateStrings0" (this, NoSubstitutionTemplate, raw) => {
    if (= raw false) {
      access __x0__ = (NoSubstitutionTemplate "TV")
      let string = __x0__
    } else {
      access __x1__ = (NoSubstitutionTemplate "TRV")
      let string = __x1__
    }
    return (new [string])
  }""")
}
