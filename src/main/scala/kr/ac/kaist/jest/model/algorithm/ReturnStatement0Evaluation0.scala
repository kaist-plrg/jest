package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ReturnStatement0Evaluation0 extends Algorithm {
  val name: String = "ReturnStatement0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ReturnStatement0Evaluation0" (this) => {
    app __x0__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> undefined, "Target" -> CONST_empty)))
    return __x0__
  }"""), this)
}
