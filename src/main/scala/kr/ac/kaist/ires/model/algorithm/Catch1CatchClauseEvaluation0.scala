package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch1CatchClauseEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""Catch1CatchClauseEvaluation0" (this, Block, thrownValue) => {
    access __x0__ = (Block "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
