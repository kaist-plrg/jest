package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Literal0Evaluation0 extends Algorithm {
  val name: String = "Literal0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Literal0Evaluation0" (this, NullLiteral) => {
    app __x0__ = (WrapCompletion null)
    return __x0__
  }"""), this)
}
