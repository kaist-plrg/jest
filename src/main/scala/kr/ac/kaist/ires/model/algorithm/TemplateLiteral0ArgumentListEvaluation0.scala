package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateLiteral0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""TemplateLiteral0ArgumentListEvaluation0" (this, NoSubstitutionTemplate) => {
    let templateLiteral = this
    app __x0__ = (GetTemplateObject templateLiteral)
    let siteObj = __x0__
    app __x1__ = (WrapCompletion (new [siteObj]))
    return __x1__
  }""")
}