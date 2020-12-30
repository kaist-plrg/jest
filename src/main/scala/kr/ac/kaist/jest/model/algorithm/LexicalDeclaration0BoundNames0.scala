package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LexicalDeclaration0BoundNames0 extends Algorithm {
  val name: String = "LexicalDeclaration0BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LexicalDeclaration0BoundNames0" (this, LetOrConst, BindingList) => {
    access __x0__ = (BindingList "BoundNames")
    return __x0__
  }"""), this)
}
