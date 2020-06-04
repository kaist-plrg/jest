package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LexicalDeclaration0IsConstantDeclaration0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LexicalDeclaration0IsConstantDeclaration0" (this, LetOrConst, BindingList) => {
    access __x0__ = (LetOrConst "IsConstantDeclaration")
    return __x0__
  }"""))
}
