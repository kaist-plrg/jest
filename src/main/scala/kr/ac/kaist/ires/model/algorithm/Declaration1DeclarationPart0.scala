package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Declaration1DeclarationPart0 extends Algorithm {
  val name: String = "Declaration1DeclarationPart0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Declaration1DeclarationPart0" (this, ClassDeclaration) => return ClassDeclaration"""), this)
}
