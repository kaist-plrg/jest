package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Literal3Evaluation0 extends Algorithm {
  val name: String = "Literal3Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Literal3Evaluation0" (this, StringLiteral) => {
    access __x0__ = (StringLiteral "StringValue")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
