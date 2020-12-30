package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateLiteral0ArgumentListEvaluation0 extends Algorithm {
  val name: String = "TemplateLiteral0ArgumentListEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateLiteral0ArgumentListEvaluation0" (this, NoSubstitutionTemplate) => {
    let templateLiteral = this
    app __x0__ = (GetTemplateObject templateLiteral)
    let siteObj = __x0__
    app __x1__ = (WrapCompletion (new [siteObj]))
    return __x1__
  }"""), this)
}
