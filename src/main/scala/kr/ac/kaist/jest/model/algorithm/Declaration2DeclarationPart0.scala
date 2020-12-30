package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Declaration2DeclarationPart0 extends Algorithm {
  val name: String = "Declaration2DeclarationPart0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Declaration2DeclarationPart0" (this, LexicalDeclaration) => return LexicalDeclaration"""), this)
}
