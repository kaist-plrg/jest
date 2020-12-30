package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NewTarget0Evaluation0 extends Algorithm {
  val name: String = "NewTarget0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewTarget0Evaluation0" (this) => {
    app __x0__ = (GetNewTarget )
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
