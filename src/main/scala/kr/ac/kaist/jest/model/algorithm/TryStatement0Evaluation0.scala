package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TryStatement0Evaluation0 extends Algorithm {
  val name: String = "TryStatement0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TryStatement0Evaluation0" (this, Block, Catch) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    if (= B["Type"] CONST_throw) {
      access __x1__ = (Catch "CatchClauseEvaluation")
      app __x2__ = (__x1__ B["Value"])
      let C = __x2__
    } else let C = B
    app __x3__ = (UpdateEmpty C undefined)
    app __x4__ = (Completion __x3__)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
