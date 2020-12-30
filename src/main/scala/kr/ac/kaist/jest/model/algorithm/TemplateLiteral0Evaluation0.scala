package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TemplateLiteral0Evaluation0 extends Algorithm {
  val name: String = "TemplateLiteral0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateLiteral0Evaluation0" (this, NoSubstitutionTemplate) => {
    access __x0__ = (NoSubstitutionTemplate "TV")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
