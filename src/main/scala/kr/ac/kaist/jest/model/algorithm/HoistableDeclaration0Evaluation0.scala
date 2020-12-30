package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object HoistableDeclaration0Evaluation0 extends Algorithm {
  val name: String = "HoistableDeclaration0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""HoistableDeclaration0Evaluation0" (this, FunctionDeclaration) => {
    access __x0__ = (FunctionDeclaration "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
