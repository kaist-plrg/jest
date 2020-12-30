package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TryStatement1Evaluation0 extends Algorithm {
  val name: String = "TryStatement1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TryStatement1Evaluation0" (this, Block, Finally) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    access __x1__ = (Finally "Evaluation")
    let F = __x1__
    if (= F["Type"] CONST_normal) F = B else {}
    app __x2__ = (UpdateEmpty F undefined)
    app __x3__ = (Completion __x2__)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
