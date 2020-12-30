package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LabelledItem1LexicallyDeclaredNames0 extends Algorithm {
  val name: String = "LabelledItem1LexicallyDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledItem1LexicallyDeclaredNames0" (this, FunctionDeclaration) => {
    access __x0__ = (FunctionDeclaration "BoundNames")
    return __x0__
  }"""), this)
}
