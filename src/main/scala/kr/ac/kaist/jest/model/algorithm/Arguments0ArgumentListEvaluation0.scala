package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Arguments0ArgumentListEvaluation0 extends Algorithm {
  val name: String = "Arguments0ArgumentListEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Arguments0ArgumentListEvaluation0" (this) => {
    app __x0__ = (WrapCompletion (new []))
    return __x0__
  }"""), this)
}
