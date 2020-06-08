package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName1Evaluation0 extends Algorithm {
  val name: String = "LiteralPropertyName1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LiteralPropertyName1Evaluation0" (this, StringLiteral) => {
    app __x0__ = (WrapCompletion !!! "StringOp")
    return __x0__
  }"""), this)
}
