package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LexicalDeclaration0IsConstantDeclaration0 extends Algorithm {
  val name: String = "LexicalDeclaration0IsConstantDeclaration0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LexicalDeclaration0IsConstantDeclaration0" (this, LetOrConst, BindingList) => {
    access __x0__ = (LetOrConst "IsConstantDeclaration")
    return __x0__
  }"""), this)
}
