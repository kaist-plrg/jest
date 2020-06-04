package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName1Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LiteralPropertyName1Evaluation0" (this, StringLiteral) => {
    access __x0__ = (StringLiteral "SV")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""))
}
