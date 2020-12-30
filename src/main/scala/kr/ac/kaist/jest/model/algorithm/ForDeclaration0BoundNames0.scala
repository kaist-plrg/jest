package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ForDeclaration0BoundNames0 extends Algorithm {
  val name: String = "ForDeclaration0BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ForDeclaration0BoundNames0" (this, LetOrConst, ForBinding) => {
    access __x0__ = (ForBinding "BoundNames")
    return __x0__
  }"""), this)
}
