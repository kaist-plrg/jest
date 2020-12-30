package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionDeclaration0IsConstantDeclaration0 extends Algorithm {
  val name: String = "FunctionDeclaration0IsConstantDeclaration0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionDeclaration0IsConstantDeclaration0" (this, BindingIdentifier, FormalParameters, FunctionBody) => return false"""), this)
}
