package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Literal2Evaluation0 extends Algorithm {
  val name: String = "Literal2Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Literal2Evaluation0" (this, NumericLiteral) => {
    access __x0__ = (NumericLiteral "NumericValue")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
