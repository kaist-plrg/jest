package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Catch1CatchClauseEvaluation0 extends Algorithm {
  val name: String = "Catch1CatchClauseEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Catch1CatchClauseEvaluation0" (this, Block, thrownValue) => {
    access __x0__ = (Block "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
